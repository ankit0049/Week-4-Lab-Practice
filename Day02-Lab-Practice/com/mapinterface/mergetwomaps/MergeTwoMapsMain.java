package com.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

import static com.mapinterface.mergetwomaps.MergeTwoMaps.mergeMaps;

public class MergeTwoMapsMain{
    public static void main(String[] args) {
        // Creating first map with key-value pairs
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Creating second map with key-value pairs
        Map<String, Integer> map2 = new HashMap<>();

        // 'B' exists in map1, values will be summed (2 + 3)
        map2.put("B", 3);

        // 'C' does not exist in map1, will be added
        map2.put("C", 4);

        // Merging the two maps and printing the result
        System.out.println(mergeMaps(map1, map2));  
        // Output: {A=1, B=5, C=4}
    }
}
