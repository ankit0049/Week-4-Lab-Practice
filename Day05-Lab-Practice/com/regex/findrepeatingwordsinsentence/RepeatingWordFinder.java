package com.findrepeatingwordsinsentence;
import java.util.regex.*;
import java.util.HashSet;

class RepeatingWordFinder {
	public static HashSet<String> findRepeatingWords(String text) {
		// Defining a regex pattern to match consecutive repeating words
		String regex = "\\b(\\w+)\\s+\\1\\b";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		// Creating a matcher to find matches in the given text
		Matcher matcher = pattern.matcher(text);

		// Creating a set to store the repeating words
		HashSet<String> repeatingWords = new HashSet<>();

		// Iterating through the matches found in the text
		while (matcher.find()) {
			// Adding each repeated word to the set
			repeatingWords.add(matcher.group(1));
		}

		// Returning the set of repeating words
		return repeatingWords;
	}

	public static void main(String[] args) {
		// Defining a sample text containing repeated words
		String text = "This is is a repeated repeated word test.";

		// Finding repeating words using the defined method
		HashSet<String> result = RepeatingWordFinder.findRepeatingWords(text);

		// Printing the repeating words
		System.out.println("Original Text: " + text);
		System.out.println("Repeated Text: " + result);
	}
}
