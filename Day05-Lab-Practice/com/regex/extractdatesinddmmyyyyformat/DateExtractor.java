package com.extractdatesinddmmyyyyformat;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

class DateExtractor {
	public static List<String> extractDates(String text) {
		// Defining a regex pattern to match dates in the format dd/mm/yyyy
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to find matches in the given text
		Matcher matcher = pattern.matcher(text);

		// Creating a list to store the extracted dates
		List<String> dates = new ArrayList<>();

		// Iterating through the matches found in the text
		while (matcher.find()) {
			dates.add(matcher.group());
		}

		// Returning the list of extracted dates
		return dates;
	}

	public static void main(String[] args) {
		// Defining a sample sentence containing multiple dates
		String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

		// Extracting dates using the defined method
		List<String> result = DateExtractor.extractDates(text);

		// Printing the extracted dates
		System.out.println("Original String: " + text);
		System.out.println("Extracted Dates: " + result);
	}
}
