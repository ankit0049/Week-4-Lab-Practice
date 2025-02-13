package com.setinterfaceproblems.checkiftwosetsareequal;
import java.util.*;

public class CheckSetsEqualityMain {

	public static void main(String[] args) {
		// Create two sets for comparison
		Set<Integer> set1 = new HashSet<>(Arrays.asList(11, 2, 38));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(38, 2, 11));

		// Test if the two sets are equal
		boolean result = CheckSetsEquality.areSetsEqual(set1, set2);
	    // Expected output: true
	    System.out.println("Are sets equal? " + result);
	}
}
