package com.queueinterface.circularbuffersimulations;

import java.util.*;

public class CircularBuffer {
    // Array to store buffer elements
    private int[] buffer;

    // Maximum size of the buffer
    private int size;

    // Pointers to track the head (oldest element) and tail (newest element)
    private int head = 0, tail = 0;

    // Variable to track the number of elements currently in the buffer
    private int count = 0;

    // Constructor to initialize the circular buffer with a given capacity
    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = capacity;
    }

    // Method to add an element to the buffer
    public void enqueue(int x) {
        // Add the new element at the tail position
        buffer[tail] = x;

        // Move the tail pointer to the next position in a circular manner
        tail = (tail + 1) % size;

        // If the buffer is full, move the head pointer to overwrite the oldest element
        if (count == size) {
            head = (head + 1) % size;
        } else {
            // Otherwise, increase the count of stored elements
            count++;
        }
    }

    // Method to retrieve all elements in the buffer as a list
    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();

        // Traverse the buffer and collect elements in order
        for (int i = 0; i < count; i++) {
            // Access elements in a circular manner
            result.add(buffer[(head + i) % size]);
        }

        return result;
    }
}