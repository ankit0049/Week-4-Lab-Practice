package com.queueinterface.implementstackusingqueue;

import java.util.*;

public class StackImplementation {
    public static void main(String[] args) {
	   // Test the StackUsingQueues class
	   StackUsingQueues stack = new StackUsingQueues();

	   // Adding the data inside the stack
	   stack.push(1);
	   stack.push(2);
	   stack.push(3);
	   // Printing the top element of the stack
	   System.out.println("Top Element: " + stack.top());
	   // Printing the popped element of the stack

	   System.out.println("Popped: " + stack.pop());

	   // printing the peek element of the stack
	   System.out.println("Top Element: " + stack.isEmpty());


    }
}
