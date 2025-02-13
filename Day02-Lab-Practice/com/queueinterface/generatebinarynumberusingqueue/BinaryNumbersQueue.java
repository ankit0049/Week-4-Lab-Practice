package com.queueinterface.generatebinarynumberusingqueue;

import java.util.*;

public class BinaryNumbersQueue {

    // Method to generate the first 'n' binary numbers using a queue
    public static List<String> generateBinaryNumbers(int n) {
        // List to store the generated binary numbers
        List<String> result = new ArrayList<>();

        // Queue to generate and store binary numbers
        Queue<String> queue = new LinkedList<>();

        // Start with "1" as the first binary number
        queue.add("1");

        // Generate 'n' binary numbers
        for (int i = 0; i < n; i++) {
            // Remove the front element of the queue
            String binary = queue.remove();

            // Add the removed binary number to the result list
            result.add(binary);

            // Generate the next two binary numbers and add them to the queue
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        // Return the list of generated binary numbers
        return result;
    }
}