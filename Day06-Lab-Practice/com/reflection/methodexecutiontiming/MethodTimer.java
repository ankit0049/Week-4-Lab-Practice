package com.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

// Utility class to measure method execution time using Reflection
public class MethodTimer {
	// Method to execute a method dynamically and measure time
	public static void executeWithTiming(Object obj, String methodName) {
		try {
			// Get the method from the class
			Method method = obj.getClass().getMethod(methodName);

			// Capture start time
			long startTime = System.nanoTime();

			// Invoke the method dynamically
			method.invoke(obj);

			// Capture end time
			long endTime = System.nanoTime();

			// Calculate and print execution time in milliseconds
			System.out.println("Execution time of " + methodName + ": " + ((endTime - startTime) / 1000000.0) + " ms");

		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
