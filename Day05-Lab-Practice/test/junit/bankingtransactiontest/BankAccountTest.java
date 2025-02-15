package junit.bankingtransactiontest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.bankingtransaction.BankAccount;
import org.junit.jupiter.api.*;

public class BankAccountTest {

    // Create a object of BankAccount for testing.
    private BankAccount account;

    @BeforeEach
    void setUp() {
        // Initializing the bank account with a predefined balance before each test.
        account = new BankAccount(100.0);
    }

    @Test
    void testDepositValidAmount() {
        // Depositing 50 should increase balance from 100 to 150.
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdrawValidAmount() {
        // Withdrawing 40 should reduce balance from 100 to 60.
        account.withdraw(40.0);

        // Checking weather getting same as expected or not
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        // Trying to withdraw more than the balance should throw an exception.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));

        // Testing weather exception message is same or not
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        // Depositing a negative amount should throw an exception.
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }
}
