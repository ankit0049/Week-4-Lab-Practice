package com.mapinterface.findingkeywithhighestvalue;
import java.util.HashMap;
import java.util.Map;

import static com.mapinterface.findingkeywithhighestvalue.MaxValueKeyFinder.findMaxKey;

class MaxValueKeyFinderTest {
    public static void main(String[] args) {
        // Creating a HashMap with sample key-value pairs
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);

        // Finding and printing the key with the highest value
        System.out.println(findMaxKey(input));
        // Output: B (because B has the highest value of 20)
    }
}
