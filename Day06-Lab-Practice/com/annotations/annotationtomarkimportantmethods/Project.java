package com.annotations.annotationtomarkimportantmethods;

// Defining a class that uses the @ImportantMethod annotation
public class Project {
	// Applying the annotation to a high-priority method
	@ImportantMethod(level = "HIGH")
	public void criticalTask() {
		System.out.println("Executing critical task");
	}

	// Applying the annotation to a medium-priority method
	@ImportantMethod(level = "MEDIUM")
	public void normalTask() {
		System.out.println("Executing normal task");
	}
}

