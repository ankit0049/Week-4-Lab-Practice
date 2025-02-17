package com.reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class ModifyStaticField {
	public static void main(String[] args) {
		try {
			// Displaying the initial API key value
			Configuration.displayApiKey();

			// Retrieving the Class object for Configuration
			Class<?> configClass = Class.forName("com.reflection.accessandmodifystaticfields.Configuration");

			// Retrieving the Field object for API_KEY
			Field apiKeyField = configClass.getDeclaredField("API_KEY");

			// Making the field accessible since it is private
			apiKeyField.setAccessible(true);

			// Modifying the value of the static field
			apiKeyField.set(null, "UPDATED_SECRET_KEY");

			// Displaying the modified API key value
			Configuration.displayApiKey();

		}
		catch (Exception e) {
			// Handling exceptions related to Reflection
			System.out.println("Error: " + e.getMessage());
		}
	}
}
