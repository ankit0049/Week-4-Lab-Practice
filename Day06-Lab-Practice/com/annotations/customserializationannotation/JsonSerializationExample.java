package com.annotations.customserializationannotation;

// Defining the main class to test the JSON serialization
public class JsonSerializationExample {
	public static void main(String[] args) {
		// Creating a User object
		User userAnkit = new User("ankit_049", "ankitrajput@example.com");

		// Serializing the object to JSON
		String jsonOutput = userAnkit.toJson();

		// Printing the JSON representation
		System.out.println(jsonOutput);
	}
}
