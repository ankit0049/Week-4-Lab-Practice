package setinterfaceproblemstest;

import com.setinterfaceproblems.unionandintersectionoftwosets.UnionIntersectionSets;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionIntersectionSetsTest {

    @Test
    public void testComputeUnionIntersection() {
        // Given two sets with both common and unique elements
        Set<Integer> set1 = new HashSet<>(Set.of(11, 28, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 48, 55));


        // All elements from both sets
        Set<Integer> expectedUnion = new HashSet<>(Set.of(11, 28, 3, 48, 55));

        // Only common elements
        Set<Integer> expectedIntersection = new HashSet<>(Set.of(3));

        // Call the method under test
        Map<String, Set<Integer>> actualResult = UnionIntersectionSets.computeUnionIntersection(set1, set2);

        // Assertions to verify the results
        assertEquals(expectedUnion, actualResult.get("union"), "Union computation is incorrect!");
        assertEquals(expectedIntersection, actualResult.get("intersection"), "Intersection computation is incorrect!");
        System.out.println("All test Cases Passed!");
    }
}
