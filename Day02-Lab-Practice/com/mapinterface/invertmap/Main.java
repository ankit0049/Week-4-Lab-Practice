package com.mapinterface.invertmap;
import java.util.*;
class Main{
    public static void main(String[] args) { 
        // Creating a map named as input
        Map<String, Integer> input = new HashMap<>(); 
        // Adding key-value pairs to the map
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        // Printing the inverted map
        //Output: {1=[A, C], 2=[B]}
        System.out.println(InvertMap.invert(input));  
    }
}
