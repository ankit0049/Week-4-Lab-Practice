package com.reflection.accessandmodifystaticfields;

public class Configuration {
	// Declaring a private static field 'API_KEY'
	private static String API_KEY = "INITIAL_SECRET_KEY";

	// Method to display the API key
	public static void displayApiKey() {
		System.out.println("Current API Key: " + API_KEY);
	}
}