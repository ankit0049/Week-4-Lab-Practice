package com.extractlinksfromwebpage;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

class LinkExtractor {
	public static List<String> extractLinks(String text) {
		// Defining a regex pattern to match HTTP and HTTPS URLs
		String regex = "(https?://[\\w.-]+(?:\\.[\\w.-]+)+)";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to find matches in the given text
		Matcher matcher = pattern.matcher(text);

		// Creating a list to store the extracted links
		List<String> links = new ArrayList<>();

		// Iterating through the matches found in the text
		while (matcher.find()) {
			links.add(matcher.group());
		}

		// Returning the list of extracted links
		return links;
	}

	public static void main(String[] args) {
		// Defining a sample sentence containing multiple URLs
		String text = "Visit https://www.google.com and http://example.org for more info.";

		// Extracting URLs using the defined method
		List<String> result = extractLinks(text);

		// Printing the extracted URLs
		System.out.println("Original String: " + text);
		System.out.println("Extracted URLs: " + result);
	}
}
