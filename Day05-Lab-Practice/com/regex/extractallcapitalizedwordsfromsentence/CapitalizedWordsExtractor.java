package com.extractallcapitalizedwordsfromsentence;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

class CapitalizedWordsExtractor {
	public static List<String> extractCapitalizedWords(String text) {
		// Defining a regex pattern to match words that start with an uppercase
		String regex = "\\b[A-Z][a-z]*\\b";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to find matches in the given text
		Matcher matcher = pattern.matcher(text);

		// Creating a list to store the extracted capitalized words
		List<String> capitalizedWords = new ArrayList<>();

		// Iterating through the matches found in the text
		while (matcher.find()) {
			capitalizedWords.add(matcher.group());
		}

		// Returning the list
		return capitalizedWords;
	}

	public static void main(String[] args) {
		// Defining a sample sentence containing capitalized words
		String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

		// Extracting capitalized words using the defined method
		List<String> result = extractCapitalizedWords(text);

		// Printing the extracted capitalized words
		System.out.println("Original String: " + text);
		System.out.println("Capitalized Words: " + result);
	}
}
