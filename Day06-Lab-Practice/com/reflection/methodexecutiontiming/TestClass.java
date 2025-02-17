package com.reflection.methodexecutiontiming;

// Sample class with different methods to measure execution time
public class TestClass {
	// Method 1: Simple quick operation
	public void quickMethod() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			sum += i;
		}
		System.out.println("Quick method executed.");
	}

	// Method 2: Simulating a longer operation
	public void slowMethod() {
		try {
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Slow method executed.");
	}
}