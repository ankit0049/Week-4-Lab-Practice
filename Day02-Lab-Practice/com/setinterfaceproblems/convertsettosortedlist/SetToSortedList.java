package com.setinterfaceproblems.convertsettosortedlist;
import java.util.*;
// Create aa class to convert set into sorted list
public class SetToSortedList {
	// Converts a set of integers into a sorted list in ascending order.
	public static List<Integer> convertToSortedList(Set<Integer> set) {
		// Create a new list from the set
		List<Integer> sortedList = new ArrayList<>(set);

		// Sort the list in ascending order
		Collections.sort(sortedList);

		// Return the sorted list
		return sortedList;
	}
}
