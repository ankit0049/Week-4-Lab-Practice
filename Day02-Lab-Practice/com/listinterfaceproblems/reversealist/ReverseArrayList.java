package com.listinterfaceproblems.reversealist;

import java.util.*;

/**
 * Class to reverse the elements of an ArrayList.
 */
public class ReverseArrayList {

	/**
	 * Reverses the elements of an ArrayList without using built-in reverse methods.
	 * @param list The input ArrayList to be reversed.
	 * @return A new ArrayList with reversed elements.
	 */
	public static List<Integer> reverse(List<Integer> list) {
		// Create an empty ArrayList to store the reversed elements
		List<Integer> reversedList = new ArrayList<>();

		// Loop through the original list starting from the last element to the first
		for (int i = list.size() - 1; i >= 0; i--) {
			// Add the element from the original list to the reversed list
			reversedList.add(list.get(i));
		}

		// Return the reversed list
		return reversedList;
	}
}
