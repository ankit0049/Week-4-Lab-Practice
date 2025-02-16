package com.validatehexcolorcode;

import java.util.regex.Pattern;

// Class responsible for hex color code validation
class HexColorValidator {
	// Method to validate if the given hex color meets the required conditions
	public static boolean isValidHexColor(String colorCode) {
		/* Regular expression pattern:
		// ^#  -> Ensures the string starts with a '#' symbol
		// [0-9A-Fa-f]{6}$ -> Ensures exactly six hexadecimal characters */
		String regex = "^#[0-9A-Fa-f]{6}$";

		// Compiling the regex pattern and matching it with the input color code
		return Pattern.matches(regex, colorCode);
	}

	public static void main(String[] args) {
		// Defining test hex color codes
		String[] testColors = {"#FFA500", "#ff4500", "#123", "#GHIJKL", "#abcDEF", "#1A2B3C", "123456"};

		// Iterating through test colors and validating each one
		for (String color : testColors) {
			// Checking if the hex color code is valid and printing the result
			if (isValidHexColor(color)) {
				System.out.println(color + " -> Valid");
			}
			else {
				System.out.println(color + " -> Invalid");
			}
		}
	}
}
