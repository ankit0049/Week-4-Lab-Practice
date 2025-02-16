package com.extractprogramminglanguagenamesfromtext;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

class ProgrammingLanguageExtractor {
	public static List<String> extractLanguages(String text) {
		// Defining a regex pattern to match programming language names
		String regex = "\\b(Java|Python|JavaScript|C\\+\\+|C|Go|Ruby|Swift|Kotlin)\\b";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		// Creating a matcher to find matches in the given text
		Matcher matcher = pattern.matcher(text);

		// Creating a list to store the extracted programming languages
		List<String> languages = new ArrayList<>();

		// Iterating through the matches found in the text
		while (matcher.find()) {
			languages.add(matcher.group());
		}

		// Returning the list of extracted programming languages
		return languages;
	}

	public static void main(String[] args) {
		// Defining a sample text containing programming language names
		String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

		// Extracting programming languages using the defined method
		List<String> result = extractLanguages(text);

		// Printing the extracted programming languages
		System.out.println("Original Text: " + text);
		System.out.println("Programming Languages: " + result);
	}
}
