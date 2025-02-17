package com.reflection.generatejsonrepresentation;

import java.lang.reflect.Field;

public class JsonConverter {
	// Method to convert an object to a JSON-like string using Reflection
	public static String toJson(Object obj) {
		// Checking if the input object is null
		if (obj == null) {
			return "null";
		}

		// Getting the class type of the object
		Class<?> clazz = obj.getClass();

		// Creating a StringBuilder to construct the JSON output
		StringBuilder jsonBuilder = new StringBuilder();

		// Appending the opening brace of the JSON object
		jsonBuilder.append("{");

		// Retrieving all declared fields of the class
		Field[] fields = clazz.getDeclaredFields();

		// Iterating through each field
		for (int i = 0; i < fields.length; i++) {
			// Getting the field object
			Field field = fields[i];

			// Making private fields accessible
			field.setAccessible(true);

			try {
				// Retrieving the field value from the object
				Object fieldValue = field.get(obj);

				// Appending the field name as a JSON key
				jsonBuilder.append("\"").append(field.getName()).append("\": ");

				// Appending the field value in appropriate format
				if (fieldValue instanceof String) {
					jsonBuilder.append("\"").append(fieldValue).append("\"");
				}
				else {
					jsonBuilder.append(fieldValue);
				}
			}
			catch (IllegalAccessException e) {
				// Handling exception if field access fails
				jsonBuilder.append("\"error\": \"Unable to access field\"");
			}

			// Adding a comma if there are more fields
			if (i < fields.length - 1) {
				jsonBuilder.append(", ");
			}
		}

		// Appending the closing brace of the JSON object
		jsonBuilder.append("}");

		// Returning the formatted JSON string
		return jsonBuilder.toString();
	}
}
