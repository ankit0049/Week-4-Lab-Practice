package com.extractcurrencyvaluesfromtext;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

class CurrencyExtractor {
	public static List<String> extractCurrencyValues(String text) {
		// Defining a regex pattern to match currency values
		String regex = "\\$?\\d+\\.\\d{2}";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to find matches in the given text
		Matcher matcher = pattern.matcher(text);

		// Creating a list to store the extracted currency values
		List<String> currencyValues = new ArrayList<>();

		// Iterating through the matches found in the text
		while (matcher.find()) {
			currencyValues.add(matcher.group());
		}

		// Returning the list of extracted currency values
		return currencyValues;
	}

	public static void main(String[] args) {
		// Defining a sample text containing currency values
		String text = "The price is $45.99, and the discount is 10.50.";

		// Extracting currency values using the defined method
		List<String> result = CurrencyExtractor.extractCurrencyValues(text);

		// Printing the extracted currency values
		System.out.println("Original Text: " + text);
		System.out.println("Currency: " + result);
	}
}
