package com.queueinterface.circularbuffersimulations;

public class CircularMain {
    public static void main(String[] args) {
	   // Create a circular buffer with a capacity of 3
	   CircularBuffer cb = new CircularBuffer(3);

	   // Insert elements into the buffer
	   cb.enqueue(1);
	   cb.enqueue(2);
	   cb.enqueue(3);

	   // Display the buffer
	   System.out.println("Buffer: " + cb.getBuffer());

	   // Insert the element while capacity is full it override the data
	   cb.enqueue(4);

	   // Display the buffer after override
	   System.out.println("Buffer after inserting 4: " + cb.getBuffer());
    }
}
