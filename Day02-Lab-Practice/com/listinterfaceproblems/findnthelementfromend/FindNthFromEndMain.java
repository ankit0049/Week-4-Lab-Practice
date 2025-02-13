package com.listinterfaceproblems.findnthelementfromend;
import java.util.*;

public class FindNthFromEndMain {

	public static void main(String[] args) {
		// Create a LinkedList of characters
		LinkedList<Character> list = new LinkedList<>(Arrays.asList('R', 'A', 'J', 'P', 'U' , 'T'));

		// Test the findNthFromEnd method for N = 2
		char result = FindNthFromEnd.findNthFromEnd(list, 2);
		System.out.println("Nth element from the end: " + result);
	}
}
