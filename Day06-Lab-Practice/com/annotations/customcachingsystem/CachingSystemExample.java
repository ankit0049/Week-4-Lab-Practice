package com.annotations.customcachingsystem;

import java.lang.reflect.Method;

// Defining the main class to test caching functionality
public class CachingSystemExample {
	public static void main(String[] args) throws Exception {
		ExpensiveOperation operation = new ExpensiveOperation();

		// Getting the method object
		Method method = ExpensiveOperation.class.getMethod("factorial", int.class);

		// Checking if the method has @CacheResult annotation
		if (method.isAnnotationPresent(CacheResult.class)) {
			// Measuring execution time without cache
			long startTime1 = System.nanoTime();
			long result1 = operation.factorial(10);
			long endTime1 = System.nanoTime();
			System.out.println("First Execution (No Cache): " + result1 + " | Time: " + (endTime1 - startTime1) / 1_000 + " μs");

			// Measuring execution time with cache
			long startTime2 = System.nanoTime();
			long result2 = operation.factorial(10);
			long endTime2 = System.nanoTime();
			System.out.println("Second Execution (With Cache): " + result2 + " | Time: " + (endTime2 - startTime2) / 1_000 + " μs");
		}
	}
}
