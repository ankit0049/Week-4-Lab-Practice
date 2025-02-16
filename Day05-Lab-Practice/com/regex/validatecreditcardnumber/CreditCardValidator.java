package com.validatecreditcardnumber;

import java.util.regex.*;

class CreditCardValidator {
	public static boolean isValidCreditCard(String cardNumber) {
		// Defining a regex pattern to validate Visa and MasterCard
		String regex = "^(4\\d{15}|5[1-5]\\d{14})$";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to check if the card number matches the pattern
		Matcher matcher = pattern.matcher(cardNumber);

		// Returning true if the card number is valid, false otherwise
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Defining test cases for credit card validation
		String[] cards = {"4532756279624064", "5200828282828210", "340000000000009", "6011000990139424"};

		// Iterating through test cases to validate each card number
		for (String card : cards) {
			System.out.println(card + " is valid: " + isValidCreditCard(card));
		}
	}
}
