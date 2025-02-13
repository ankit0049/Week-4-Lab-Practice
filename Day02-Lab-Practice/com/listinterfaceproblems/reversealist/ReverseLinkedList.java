package com.listinterfaceproblems.reversealist;

import java.util.LinkedList;
import java.util.List;

// Class to reverse the elements of a LinkedList.
public class ReverseLinkedList {

	// Reverses the elements of a LinkedList without using built-in reverse methods.
	public static List<Integer> reverse(List<Integer> list) {
		// Create an empty LinkedList to store the reversed elements
		List<Integer> reversedList = new LinkedList<>();

		// Loop through the original list starting from the last element to the first
		for (int i = list.size() - 1; i >= 0; i--) {
			// Add the element from the original list to the reversed list
			reversedList.add(list.get(i));
		}

		// Return the reversed LinkedList
		return reversedList;
	}
}