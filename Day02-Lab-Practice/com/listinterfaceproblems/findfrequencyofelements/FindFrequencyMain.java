package com.listinterfaceproblems.findfrequencyofelements;
import java.util.*;

public class FindFrequencyMain {

	public static void main(String[] args) {
		// Test the findFrequency method
		List<String> list = Arrays.asList("kiwi","strawberry", "banana", "apple", "orange");

		// Create the instance of frequencyMap and get the list
		Map<String, Integer> frequencyMap = FindFrequency.findFrequency(list);

		// Displaying the frequency list
		System.out.println("Frequency Map: " + frequencyMap);
	}
}
