package com.listinterfaceproblems.reversealist;
import java.util.*;

public class ReverseListMain {
		public static void main(String[] args) {
			// Test ReverseArrayList
			List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 24, 35, 45, 57));
			List<Integer> reversedArrayList = ReverseArrayList.reverse(arrayList);
			System.out.println("Reversed ArrayList: " + reversedArrayList);

			// Test ReverseLinkedList
			List<Integer> linkedList = new LinkedList<>(Arrays.asList(71, 12, 43, 48, 15));
			List<Integer> reversedLinkedList = ReverseLinkedList.reverse(linkedList);
			System.out.println("Reversed LinkedList: " + reversedLinkedList);

	}
}
