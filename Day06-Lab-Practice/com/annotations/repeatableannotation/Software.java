package com.annotations.repeatableannotation;

// Defining a class with a method that has multiple bug reports
public class Software {
	@BugReport(description = "Fix memory leak issue")
	@BugReport(description = "Resolve UI crash on load")
	public void applicationFeature() {
		System.out.println("Feature executed");
	}
}

