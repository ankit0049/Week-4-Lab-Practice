package com.reflection.generatejsonrepresentation;

public class Person {
	// Declaring private fields
	private String name;
	private int age;

	// Constructor to initialize fields
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display object details
	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}