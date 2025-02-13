package com.queueinterface.generatebinarynumberusingqueue;
import static com.queueinterface.generatebinarynumberusingqueue.BinaryNumbersQueue.generateBinaryNumbers;

public class BinaryNumbersQueueTest {
    public static void main(String[] args) {
        // take the  number and find binary till the number is reached
        int n = 5;

        // Print the first 'n' binary numbers
        System.out.println("First " + n + " binary numbers: " + generateBinaryNumbers(n));
    }
}
