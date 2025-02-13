package insurancepolicymanagementsystemtest;

import com.insurancepolicymanagement.InsurancePolicy;
import com.insurancepolicymanagement.InsurancePolicyManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

public class InsurancePolicyManagerTest {
    private InsurancePolicyManager manager;

    // Setup method executed before each test.
    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManager();
    }

    // Ensures that a policy is correctly added and retrieved.
    @Test
    void testAddPolicy() {
        // Creating a new policy
        InsurancePolicy policy = new InsurancePolicy("P001", "Ankit", LocalDate.of(2025, 2, 15),  1200);
        manager.addPolicy(policy);

        // Fetching all policies and verifying the count
        List<InsurancePolicy> allPolicies = manager.getAllPolicies();
        assertEquals(1, allPolicies.size());

        // Checking if the added policy has the correct policy number
        assertEquals("P001", allPolicies.get(0).getPolicyNumber());
    }


}
