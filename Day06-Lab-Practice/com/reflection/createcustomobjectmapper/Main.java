package com.reflection.createcustomobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// Creating a map with field names as keys and their corresponding values
		Map<String, Object> personData = new HashMap<>();
		personData.put("name", "Ankit");
		personData.put("age", 21);

		// Using the CustomObjectMapper to create and populate a Person object
		Person person = CustomObjectMapper.toObject(Person.class, personData);

		// Displaying the populated object details
		person.display();
	}
}
