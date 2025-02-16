package com.annotations.repeatableannotation;

import java.lang.reflect.Method;

// Defining the main class to retrieve multiple bug reports
public class RepeatableAnnotationExample {
	public static void main(String[] args) throws Exception {
		// Getting the method object
		Method method = Software.class.getMethod("applicationFeature");

		// Checking if the annotation is present
		if (method.isAnnotationPresent(BugReports.class)) {
			BugReports bugReports = method.getAnnotation(BugReports.class);
			for (BugReport bugReport : bugReports.value()) {
				System.out.println("Bug Description: " + bugReport.description());
			}
		}
	}
}
