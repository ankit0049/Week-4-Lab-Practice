package com.annotations.customserializationannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Defining a User class with fields annotated using @JsonField
public class User {
	// Mapping this field to "user_name" in JSON
	@JsonField(name = "user_name")
	private String username;

	// Mapping this field to "email_id" in JSON
	@JsonField(name = "email_id")
	private String email;

	// Defining the constructor to initialize fields
	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	// Defining a method to serialize the object to a JSON string
	public String toJson() {
		Map<String, String> jsonMap = new HashMap<>();

		// Getting all declared fields of the class
		Field[] fields = this.getClass().getDeclaredFields();

		// Iterating through fields
		for (Field field : fields) {
			// Checking if the field has the @JsonField annotation
			if (field.isAnnotationPresent(JsonField.class)) {
				field.setAccessible(true);
				try {
					// Retrieving the annotation and mapping field name to JSON key
					JsonField annotation = field.getAnnotation(JsonField.class);
					jsonMap.put(annotation.name(), (String) field.get(this));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		// Constructing JSON string
		return jsonMap.toString().replace("=", ": ").replace(",", ", ");
	}
}

