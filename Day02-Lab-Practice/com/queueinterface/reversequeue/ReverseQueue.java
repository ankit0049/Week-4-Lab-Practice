package com.queueinterface.reversequeue;

import java.util.*;

public class ReverseQueue {
    public static <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();

        // Dequeue all elements into the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Push back elements into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}

