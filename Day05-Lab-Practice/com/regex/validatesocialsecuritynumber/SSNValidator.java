package com.validatesocialsecuritynumber;
import java.util.regex.*;

class SSNValidator {
	public static boolean isValidSSN(String ssn) {
		// Defining a regex pattern to match valid SSNs in the format "XXX-XX-XXXX"
		String regex = "^(\\d{3}-\\d{2}-\\d{4})$";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to check if the SSN matches the pattern
		Matcher matcher = pattern.matcher(ssn);

		// Returning true if the SSN is valid, false otherwise
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Defining test cases with both valid and invalid SSNs
		String[] ssns = {"123-45-6789", "987-65-4321", "123456789", "123-456-789"};

		// Iterating through test cases to validate each SSN
		for (String ssn : ssns) {
			System.out.println(ssn + " is valid: " + SSNValidator.isValidSSN(ssn));
		}
	}
}
