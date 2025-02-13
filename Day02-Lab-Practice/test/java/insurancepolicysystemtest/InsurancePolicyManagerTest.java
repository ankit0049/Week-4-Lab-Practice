package insurancepolicysystemtest;

import com.insurancepolicymanagement.InsurancePolicy;
import com.insurancepolicymanagement.InsurancePolicyManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagerTest {
    private InsurancePolicyManager manager;

    @BeforeEach
    void setUp() {
        // Initializing the InsurancePolicyManager before each test
        manager = new InsurancePolicyManager();

        // Adding sample policies
        manager.addPolicy(new InsurancePolicy("PA01", "Ankit", LocalDate.of(2025, 5, 15), 1200));
        manager.addPolicy(new InsurancePolicy("PA02", "Rajput", LocalDate.of(2024, 3, 10), 1500));
        manager.addPolicy(new InsurancePolicy("PA03", "Abhishek", LocalDate.of(2024, 2, 25), 1800));
        manager.addPolicy(new InsurancePolicy("PA04", "Ajeet", LocalDate.of(2024, 4, 5), 1100));
    }

    @Test
    void testAddPolicy() {
        // Adding a new policy and verifying if it is stored correctly
        manager.addPolicy(new InsurancePolicy("PA05", "Sharma", LocalDate.of(2025, 8, 20), 2500));

        // Checking if the policy exists in the manager
        InsurancePolicy policy = manager.getPolicyByNumber("PA05");
        assertNotNull(policy);
        assertEquals("Sharma", policy.getPolicyholderName());
        assertEquals(2500, policy.getPremiumAmount());
    }

    @Test
    void testRetrievePolicyByNumber() {
        // Retrieving a policy by policy number and checking details
        InsurancePolicy policy = manager.getPolicyByNumber("PA02");
        assertNotNull(policy);
        assertEquals("Rajput", policy.getPolicyholderName());
        assertEquals(1500, policy.getPremiumAmount());
    }

    @Test
    void testRetrieveNonExistentPolicy() {
        // Attempting to retrieve a non-existing policy
        InsurancePolicy policy = manager.getPolicyByNumber("PA99");
        assertNull(policy);
    }

    @Test
    void testListExpiringPolicies() {
        // Checking if expiring policies within 30 days are listed correctly
        int expiringPolicies = manager.getExpiringPolicies().size();
        assertTrue(expiringPolicies > 0, "There should be at least one expiring policy.");
    }

    @Test
    void testRemoveExpiredPolicies() {
        // Removing expired policies and checking if they are deleted
        manager.removeExpiredPolicies();

        // Policy PA03 (expired) should no longer exist
        assertNull(manager.getPolicyByNumber("PA03"));

        // Policy PA02 (expired) should also be removed
        assertNull(manager.getPolicyByNumber("PA02"));
    }
}
