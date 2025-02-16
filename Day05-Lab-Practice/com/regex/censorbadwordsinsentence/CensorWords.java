package com.censorbadwordsinsentence;

class CensorWords {
	public static String censorBadWords(String text, String[] badWords) {
		// Iterating through the list of bad words
		for (String word : badWords) {
			// Using regex to replace the bad word with asterisks while ignoring case
			text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
		}

		// Returning the modified text
		return text;
	}

	public static void main(String[] args) {
		// Defining a sample sentence containing bad words
		String text = "This is a damn bad example with some stupid words.";

		// Defining an array of words to be censored
		String[] badWords = {"damn", "stupid"};

		// Censoring bad words using the defined method
		System.out.println("Original text: " + text);
		System.out.println("After replacing: " + censorBadWords(text, badWords));
	}
}
