package com.setinterfaceproblems.checkiftwosetsareequal;
import java.util.*;

// Class to check if two sets are equal, i.e., they contain the same elements, regardless of order.
public class CheckSetsEquality {

	//Compares two sets and determines if they contain the same elements, regardless of order.
	public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
		// Return true if both sets are equal, meaning they contain the same elements
		return set1.equals(set2);
	}
}
