package com.reflection.methodexecutiontiming;

public class Main {
	public static void main(String[] args) {
		// Create an instance of the test class
		TestClass testInstance = new TestClass();

		// Measure execution time for quickMethod
		MethodTimer.executeWithTiming(testInstance, "quickMethod");

		// Measure execution time for slowMethod
		MethodTimer.executeWithTiming(testInstance, "slowMethod");
	}
}
