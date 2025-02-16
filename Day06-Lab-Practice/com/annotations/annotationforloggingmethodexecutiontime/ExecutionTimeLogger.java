package com.annotations.annotationforloggingmethodexecutiontime;

import java.lang.reflect.Method;

// Defining the main class to measure execution time
public class ExecutionTimeLogger {
	public static void main(String[] args) throws Exception {
		// Getting the method object
		Method method = PerformanceTest.class.getMethod("complexCalculation");

		// Checking if the method has the @LogExecutionTime annotation
		if (method.isAnnotationPresent(LogExecutionTime.class)) {
			long startTime = System.nanoTime();
			method.invoke(new PerformanceTest());
			long endTime = System.nanoTime();
			System.out.println("Execution Time: " + (endTime - startTime) / 1000000 + " ms");
		}
	}
}
