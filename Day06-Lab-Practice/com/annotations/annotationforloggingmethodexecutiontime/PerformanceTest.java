package com.annotations.annotationforloggingmethodexecutiontime;

// Defining a class with methods to measure execution time
public class PerformanceTest {
	// Applying the @LogExecutionTime annotation
	@LogExecutionTime
	public void complexCalculation() {
		long sum = 0;
		for (int i = 0; i < 1_000_000; i++) {
			sum += i;
		}
		System.out.println("Calculation completed");
	}
}

