package setinterfaceproblemstest;

import com.setinterfaceproblems.checkiftwosetsareequal.CheckSetsEquality;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfTwoSetEqualTest {
    @Test
    public void testAreSetsEqual() {
	   // Create two sets with the same elements in different orders
	   Set<Integer> set1 = new HashSet<>(Arrays.asList(11, 2, 38));
	   Set<Integer> set2 = new HashSet<>(Arrays.asList(38, 2, 11));

	   // Expected result: true (since sets are unordered and contain the same elements)
	   assertTrue(CheckSetsEquality.areSetsEqual(set1, set2), "Sets should be equal");

	   // Create a different set
	   Set<Integer> set3 = new HashSet<>(Arrays.asList(11, 2, 39));

	   // Expected result: false (different element)
	   assertFalse(CheckSetsEquality.areSetsEqual(set1, set3), "Sets should not be equal");

	   // Test with empty sets
	   assertTrue(CheckSetsEquality.areSetsEqual(new HashSet<>(), new HashSet<>()), "Empty sets should be equal");

	   // Test with one empty set
	   assertFalse(CheckSetsEquality.areSetsEqual(set1, new HashSet<>()), "Non-empty set should not be equal to an empty set");
	   System.out.println("Successfully passed all test cases");
    }

}
