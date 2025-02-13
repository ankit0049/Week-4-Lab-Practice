package setinterfaceproblemstest;

import com.setinterfaceproblems.symmetricdifference.SymmetricDifference;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymmetricDifferenceTest {

    @Test
    public void testComputeSymmetricDifference() {
        // Given two sets with some common and some unique elements
        Set<Integer> set1 = new HashSet<>(Set.of(1, 24, 48));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 48, 59));

        // Expected symmetric difference (elements present in one set but not both)
        Set<Integer> expectedResult = new HashSet<>(Set.of(1, 24, 3, 59));

        // Compute the actual symmetric difference using the method under test
        Set<Integer> actualResult = SymmetricDifference.computeSymmetricDifference(set1, set2);

        // Assert that the expected and actual results match
        assertEquals(expectedResult, actualResult, "Symmetric difference computation failed!");
        System.out.println("Successfully computed symmetric difference");
    }
}
