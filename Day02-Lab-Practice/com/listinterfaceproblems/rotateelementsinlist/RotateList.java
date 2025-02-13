package com.listinterfaceproblems.rotateelementsinlist;
import java.util.*;

// Class to rotate the elements of a list by a given number of positions.

public class RotateList {

	// Rotates the elements of the list by the specified number of positions.
	public static List<Integer> rotate(List<Integer> list, int positions) {
		// Check if the list is empty or no rotation is required
		if (list.isEmpty() || positions == 0) {
			return list;
		}

		// Calculate the effective number of rotations required (positions modulo list size)
		positions = positions % list.size();

		// Create a new list to store the rotated elements
		List<Integer> rotatedList = new ArrayList<>();

		// Add the elements after the rotation point
		rotatedList.addAll(list.subList(positions, list.size()));

		// Add the elements before the rotation point
		rotatedList.addAll(list.subList(0, positions));

		// Return the rotated list
		return rotatedList;
	}
}
