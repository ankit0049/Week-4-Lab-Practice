package com.setinterfaceproblems.symmetricdifference;

import java.util.*;

public class SymmetricDifferenceMain {
    public static void main(String[] args) {
	   // Create two sets for symmetric difference computation
	   Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 24, 48));
	   Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 48, 59));

	   // Compute the symmetric difference
	   Set<Integer> result = SymmetricDifference.computeSymmetricDifference(set1, set2);

	   // Print the result
	   // Expected output: {1, 2, 4, 5}
	   System.out.println("Symmetric Difference: " + result);
    }
}
