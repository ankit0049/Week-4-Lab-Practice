package com.reflection.createcustomobjectmapper;

public class Person {
	// Declaring private fields
	private String name;
	private int age;

	// Default constructor (needed for Reflection-based instantiation)
	public Person() {
	}

	// Method to display object details
	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}