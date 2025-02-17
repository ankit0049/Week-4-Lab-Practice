package com.reflection.retrieveannotationsatruntime;

import java.lang.annotation.Annotation;

public class AnnotationRetriever {
	public static void main(String[] args) {
		try {
			// Retrieving the Class object for the Book class
			Class<?> bookClass = Class.forName("com.reflection.retrieveannotationsatruntime.Book");

			// Checking if the @Author annotation is present in the Book class
			if (bookClass.isAnnotationPresent(Author.class)) {
				// Retrieving the @Author annotation instance
				Annotation annotation = bookClass.getAnnotation(Author.class);

				// Casting the annotation to Author type
				Author author = (Author) annotation;
				System.out.println("Author: " + author.name());
			}
			else {
				// Displaying message if the annotation is not present
				System.out.println("No @Author annotation found in the Book class.");
			}

		}
		catch (Exception e) {
			// Handling exceptions related to Reflection
			System.out.println("Error: " + e.getMessage());
		}
	}
}
