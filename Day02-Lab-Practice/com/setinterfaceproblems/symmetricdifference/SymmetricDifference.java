package com.setinterfaceproblems.symmetricdifference;
import java.util.*;

// Class to compute the symmetric difference (elements present in either set but not both).
public class SymmetricDifference {

	// Computes the symmetric difference of two sets.
	public static Set<Integer> computeSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
		// Create a new set to store the symmetric difference
		Set<Integer> symmetricDifference = new HashSet<>(set1);

		// Add all elements from set2, excluding common elements
		symmetricDifference.addAll(set2);

		// Remove the intersection (common elements) from the symmetric difference set
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		symmetricDifference.removeAll(intersection);

		// Return the symmetric difference set
		return symmetricDifference;
	}
}
