package com.annotations.annotationtomarkimportantmethods;

import java.lang.reflect.Method;

// Defining the main class to retrieve and print annotated methods
public class ImportantMethodExample {
	public static void main(String[] args) throws Exception {
		// Getting all methods of the Project class
		Method[] methods = Project.class.getDeclaredMethods();

		// Iterating through the methods
		for (Method method : methods) {
			// Checking if the method has the @ImportantMethod annotation
			if (method.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
				System.out.println("Method: " + method.getName() + " | Priority Level: " + annotation.level());
			}
		}
	}
}
