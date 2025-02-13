package com.mapinterface.findingkeywithhighestvalue;

import java.util.*;

public class MaxValueKeyFinder {

    // Method to find the key with the highest value in a given map
    public static String findMaxKey(Map<String, Integer> map) {
        // To store the key with the highest value
        String maxKey = null;

        // Initialize with the smallest possible value
        int maxValue = Integer.MIN_VALUE;

        // Iterate through each entry in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // If the current value is greater than maxValue, update maxKey and maxValue
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        // Return the key with the highest value
        return maxKey;
    }
}