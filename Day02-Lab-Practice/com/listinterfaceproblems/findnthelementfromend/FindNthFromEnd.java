package com.listinterfaceproblems.findnthelementfromend;
import java.util.*;

// Class to find the Nth element from the end of a singly linked list.

public class FindNthFromEnd {

	// Finds the Nth element from the end of a singly linked list.


	public static Character findNthFromEnd(LinkedList<Character> list, int n) {
		// Create two pointers, one will lead and the other will follow
		Iterator<Character> mainPointer = list.iterator();
		Iterator<Character> followPointer = list.iterator();

		// Move the main pointer n steps ahead
		for (int i = 0; i < n; i++) {
			if (mainPointer.hasNext()) {
				mainPointer.next();
			} else {
			    // In case n is larger than the size of the list
			    return null;
			}
		}

		// Move both pointers until the main pointer reaches the end
		while (mainPointer.hasNext()) {
			mainPointer.next();
			followPointer.next();
		}

		// The follow pointer is now at the Nth element from the end
		return followPointer.next();
	}
}
