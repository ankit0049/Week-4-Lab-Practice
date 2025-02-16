package com.extractallemailaddressesfromtext;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

// Class responsible for extracting email addresses
class EmailExtractor {
	// Method to extract all valid email addresses from a given text
	public static List<String> extractEmails(String text) {
		/* Regular expression pattern:
		   [a-zA-Z0-9._%+-]+ -> Matches the username part
		   @                 -> Ensures presence of '@' symbol
		   [a-zA-Z0-9.-]+    -> Matches the domain name
		   .[a-zA-Z]{2,}    -> Matches the top-level domain  */
		String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to find email addresses in the input text
		Matcher matcher = pattern.matcher(text);

		// List to store extracted email addresses
		List<String> emailList = new ArrayList<>();

		// Iterating through matches and adding emails to the list
		while (matcher.find()) {
			emailList.add(matcher.group());
		}

		// Returning the extracted email addresses
		return emailList;
	}

	public static void main(String[] args) {
		// Defining the input text containing email addresses
		String text = "Contact us at support@example.com and info@company.org. " +
			         "You can also reach out at hello123@domain.net.";

		// Extracting email addresses from the text
		List<String> extractedEmails = extractEmails(text);

		System.out.println("Original string: " + text);
		System.out.println("Extracted emails: ");

		// Printing the extracted email addresses
		for (String email : extractedEmails) {
			System.out.println(email);
		}
	}
}
