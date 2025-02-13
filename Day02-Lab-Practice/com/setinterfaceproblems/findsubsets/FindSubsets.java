package com.setinterfaceproblems.findsubsets;

import java.util.*;
// Class to check if one set is a subset of another.
public class FindSubsets {
    // Checks if the first set is a subset of the second set.
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
	   // Check if set1 is a subset of set2
	   return set2.containsAll(set1);
    }
}
