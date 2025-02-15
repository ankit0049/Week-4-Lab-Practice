package com.junit.listoperation;

import java.util.List;

// Create a class to manage the list operation and test the methods
public class ListManager {
    // Create a method addElement to Adds an element to the given list.
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    //Create a method removeElement to Removes the specified element from the list.
    public boolean removeElement(List<Integer> list, int element) {
        return list.remove((Integer) element);
    }

    // Create a method named getSize to Returns the current number of elements in the list.
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
