package bankingmanagementsystem;

import com.bankingmanagementsystem.BankingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankingSystemTest {
    private BankingSystem bankingSystem;

    @BeforeEach
    void setUp() {
        bankingSystem = new BankingSystem();
        bankingSystem.addCustomerAccount("A24", 1000.00);
        bankingSystem.addCustomerAccount("B05", 1500.00);
        bankingSystem.addCustomerAccount("C78", 2000.00);
        bankingSystem.addCustomerAccount("D90", 500.00);
    }

    @Test
    void testAddCustomerAccount() {
        bankingSystem.addCustomerAccount("E11", 3000.00);
        assertEquals(3000.00, bankingSystem.getCustomerBalance("E11"));
    }

    @Test
    void testWithdrawSuccessful() {
        bankingSystem.addWithdrawalRequest("A24", 200.00);
        bankingSystem.processWithdrawals();
        assertEquals(800.00, bankingSystem.getCustomerBalance("A24"));
    }

    @Test
    void testWithdrawInsufficientBalance() {
        // More than available
        bankingSystem.addWithdrawalRequest("B05", 2000.00);
        bankingSystem.processWithdrawals();
        assertEquals(1500.00, bankingSystem.getCustomerBalance("B05")); // Balance remains the same
    }

    @Test
    void testMultipleWithdrawals() {
        bankingSystem.addWithdrawalRequest("C78", 500.00);
        bankingSystem.addWithdrawalRequest("D90", 100.00);
        bankingSystem.processWithdrawals();
        assertEquals(1500.00, bankingSystem.getCustomerBalance("C78"));
        assertEquals(400.00, bankingSystem.getCustomerBalance("D90"));
    }

    @Test
    void testDisplayCustomerBalance() {
        assertEquals(1000.00, bankingSystem.getCustomerBalance("A24"));
        assertEquals(1500.00, bankingSystem.getCustomerBalance("B05"));
    }
}
