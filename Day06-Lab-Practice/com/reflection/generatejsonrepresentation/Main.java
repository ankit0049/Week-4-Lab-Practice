package com.reflection.generatejsonrepresentation;

public class Main {
	public static void main(String[] args) {
		// Creating an instance of the Person class
		Person person = new Person("Ankit", 25);

		// Converting the object to JSON format
		String jsonOutput = JsonConverter.toJson(person);

		// Printing the generated JSON-like string
		System.out.println(jsonOutput);
	}
}
