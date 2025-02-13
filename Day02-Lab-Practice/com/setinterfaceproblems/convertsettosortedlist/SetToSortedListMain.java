package com.setinterfaceproblems.convertsettosortedlist;
import java.util.*;

public class SetToSortedListMain {

	public static void main(String[] args) {
		// Create a HashSet of integers
		Set<Integer> set = new HashSet<>(Arrays.asList(85, 3, 79, 197));

		// Convert the set to a sorted list
		List<Integer> sortedList = SetToSortedList.convertToSortedList(set);

		// Print the sorted list
		System.out.println("Sorted List: " + sortedList);
	}
}
