package com.annotations.annotationforpendingtasks;

import java.lang.reflect.Method;

// Defining the main class to retrieve and print pending tasks
public class TodoAnnotationExample {
	public static void main(String[] args) throws Exception {
		// Getting all methods of the Development class
		Method[] methods = Development.class.getDeclaredMethods();

		// Iterating through the methods
		for (Method method : methods) {
			// Checking if the method has the @Todo annotation
			if (method.isAnnotationPresent(Todo.class)) {
				Todo annotation = method.getAnnotation(Todo.class);
				System.out.println("Task: " + annotation.task() + " | Assigned To: " + annotation.assignedTo() + " | Priority: " + annotation.priority());
			}
		}
	}
}
