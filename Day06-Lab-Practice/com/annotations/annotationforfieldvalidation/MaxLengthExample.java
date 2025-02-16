package com.annotations.annotationforfieldvalidation;

// Defining the main class to test the annotation functionality
public class MaxLengthExample {
	public static void main(String[] args) {
		// Creating a valid User object
		User user1 = new User("Ankit Rajut");

		// Attempting to create an invalid User object
		try {
			User user2 = new User("AnkitRajput9770");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
