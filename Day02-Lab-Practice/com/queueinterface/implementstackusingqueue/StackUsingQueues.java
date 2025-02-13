package com.queueinterface.implementstackusingqueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueues {
    // Use two queues to implement a stack
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
	   q1.add(x);
    }

    // Removes the element on top of the stack.
    public int pop() {
	   if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty!");
	   while (q1.size() > 1) {
		  q2.add(q1.remove());
	   }
	   // Remove the last element from q1
	   int top = q1.remove(); 
	   
	   // Swap q1 and q2
	   Queue<Integer> temp = q1;
	   q1 = q2;
	   q2 = temp;  
	   
	   // Return the top element
	   return top;
    }

    public int top() {
	   if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty!");
	   while (q1.size() > 1) {
		  q2.add(q1.remove());
	   }
	   int top = q1.peek();
	   q2.add(q1.remove());
	   Queue<Integer> temp = q1;
	   q1 = q2;
	   q2 = temp;
	   return top;
    }

    public boolean isEmpty() {
	   return q1.isEmpty();
    }
}