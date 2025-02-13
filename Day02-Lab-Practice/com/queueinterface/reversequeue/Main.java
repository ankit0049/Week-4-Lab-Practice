package com.queueinterface.reversequeue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import static com.queueinterface.reversequeue.ReverseQueue.reverseQueue;

public class Main{
    public static void main(String[] args) {
        // Creating queue using the LinkedList class and perform actions and reverse it
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
