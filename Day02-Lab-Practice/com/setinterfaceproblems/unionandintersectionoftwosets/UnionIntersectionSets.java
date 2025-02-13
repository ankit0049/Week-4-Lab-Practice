package com.setinterfaceproblems.unionandintersectionoftwosets;
import java.util.*;

// Class to compute the union and intersection of two sets.
public class UnionIntersectionSets {

	// Computes the union and intersection of two sets.
	public static Map<String, Set<Integer>> computeUnionIntersection(Set<Integer> set1, Set<Integer> set2) {
		// Create a Map to store the union and intersection sets
		Map<String, Set<Integer>> result = new HashMap<>();

		// Compute the union of the two sets
		Set<Integer> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);

		// Compute the intersection of the two sets
		Set<Integer> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);

		// Add the results to the map
		result.put("union", unionSet);
		result.put("intersection", intersectionSet);

		// Return the result map
		return result;
	}
}

