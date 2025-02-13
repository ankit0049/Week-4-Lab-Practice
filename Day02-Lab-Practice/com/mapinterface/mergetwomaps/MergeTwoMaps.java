package com.mapinterface.mergetwomaps;
import java.util.*;
public class MergeTwoMaps {
    // Merges two maps by adding values of common keys
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Copy map1 into mergedMap
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Add values from map2 to mergedMap
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            // If key exists, add values; otherwise, insert new key-value pair
            mergedMap.put(key, mergedMap.getOrDefault(key, 0) + value);
        }

        // Return the final merged map
        return mergedMap;
    }
}
