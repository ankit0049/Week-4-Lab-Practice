package com.reflection.dynamicallycreateobjects;

// Defining the Student class
public class Student {
	// Declaring private instance variables
	public String name;
	public int age;

	// Defining a default constructor
	public Student() {
		this.name = "Default Name";
		this.age = 18;
	}

	// Defining a parameterized constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Defining a method to display student details
	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
	}
}
