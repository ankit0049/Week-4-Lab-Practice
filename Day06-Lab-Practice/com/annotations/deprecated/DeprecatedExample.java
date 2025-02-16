package com.annotations.deprecated;

// Defining the DeprecatedExample class to test the functionality
public class DeprecatedExample {
	public static void main(String[] args) {
		// Creating an instance of LegacyAPI
		LegacyAPI api = new LegacyAPI();

		// Calling both methods to observe the warning for deprecated method
		api.oldFeature();
		api.newFeature();
	}
}
