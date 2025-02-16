package com.replacemultiplespaceswithsinglespace;

// Class to demonstrate multiple space replacement using regex
class SpaceReducer {
	public static String replaceMultipleSpaces(String text) {
		// Using regex to replace multiple spaces with a single space
		return text.replaceAll("\\s+", " ").trim();
	}

	public static void main(String[] args) {
		// Defining a sample sentence with extra spaces
		String text = "This    is   an    example  with  multiple   spaces.";

		// Reducing spaces using the defined method
		System.out.println("Original String: " + text);
		System.out.println("After space replacement: " + replaceMultipleSpaces(text));
	}
}
