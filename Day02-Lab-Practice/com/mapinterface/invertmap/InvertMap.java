package com.mapinterface.invertmap;

import java.util.*;
public class InvertMap {
    // Method to invert a map
    public static <K, V> Map<V, List<K>> invert(Map<K, V> inputMap) {
	   // Create a new map to hold the inverted key-value pairs
	   Map<V, List<K>> invertedMap = new HashMap<>();

	   // Iterate over the entries in the input map
	   for (Map.Entry<K, V> entry : inputMap.entrySet()) {
		  V value = entry.getValue();
		  K key = entry.getKey();

		  // If value already exists, add key to list, else create a new list
		  invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
	   }
	   // Return the inverted map
	   return invertedMap;
    }
}