package com.setinterfaceproblems.unionandintersectionoftwosets;
import java.util.*;

public class UnionIntersectionSetsMain {

	public static void main(String[] args) {
		// Create two sets for union and intersection
		Set<Integer> set1 = new HashSet<>(Arrays.asList(11, 28, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 48, 55));

		// Compute union and intersection
		Map<String, Set<Integer>> result = UnionIntersectionSets.computeUnionIntersection(set1, set2);

		// Print the results
	    // Expected output: {1, 2, 3, 4, 5}
	    System.out.println("Union: " + result.get("union"));

		System.out.println("Intersection: " + result.get("intersection"));
	}
}
