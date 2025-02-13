package com.listinterfaceproblems.removeduplicateswhilepreservingorder;
import java.util.*;

public class RemoveDuplicatesMain {

	public static void main(String[] args) {
		// Test the removeDuplicates method
		List<Integer> list = Arrays.asList(32, 11, 11, 2, 32, 4);

		// Create a list to hold unique elements
		List<Integer> listWithoutDuplicates = RemoveDuplicates.removeDuplicates(list);
		// Print the list without duplicates
		System.out.println("List without duplicates: " + listWithoutDuplicates);
	}
}

