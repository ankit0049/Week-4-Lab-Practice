package com.annotations.customannotation;

import java.lang.reflect.Method;

// Defining the class to retrieve annotation details using Reflection API
public class AnnotationExample {
	public static void main(String[] args) throws Exception {
		// Getting the method object
		Method method = TaskManager.class.getMethod("completeTask");

		// Checking if the annotation is present
		if (method.isAnnotationPresent(TaskInfo.class)) {
			TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
			System.out.println("Priority: " + taskInfo.priority());
			System.out.println("Assigned To: " + taskInfo.assignedTo());
		}
	}
}
