package com.listinterfaceproblems.removeduplicateswhilepreservingorder;

import java.util.*;

// Class to remove duplicate elements from a list while maintaining the original order.

public class RemoveDuplicates {

    // Removes duplicate elements from the list while maintaining the order of the first occurrence.


    public static List<Integer> removeDuplicates(List<Integer> list) {
	   // Create a LinkedHashSet to remove duplicates while maintaining insertion order
	   Set<Integer> set = new LinkedHashSet<>();

	   // Add all elements from the list into the set (duplicates will be removed automatically)
	   set.addAll(list);

	   // Convert the set back to a list and return the result
	   return new ArrayList<>(set);
    }
}
