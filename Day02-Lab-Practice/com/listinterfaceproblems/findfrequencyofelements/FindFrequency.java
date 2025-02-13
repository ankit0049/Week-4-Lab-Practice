package com.listinterfaceproblems.findfrequencyofelements;

import java.util.*;

// Create a Class to count the frequency of each element
public class FindFrequency {

    // Counts the frequency of each element in a list and returns the result as a Map.
    public static Map<String, Integer> findFrequency(List<String> list) {
	   // Create a HashMap to store the frequency of each element
	   Map<String, Integer> frequencyMap = new HashMap<>();

	   // Loop through each element in the list
	   for (String element : list) {
		  // If the element is already in the map, increment its frequency
		  if (frequencyMap.containsKey(element)) {
			 frequencyMap.put(element, frequencyMap.get(element) + 1);
		  } else {
			 // If the element is not in the map, add it with a frequency of 1
			 frequencyMap.put(element, 1);
		  }
	   }

	   // Return the frequency map containing each element and its frequency
	   return frequencyMap;
    }
}
