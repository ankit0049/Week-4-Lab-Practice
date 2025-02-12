package com.multilevelcoursemanagementsystem;

// Defining an abstract class to represent different course types
abstract class CourseType {
    // Declaring a protected variable to store the course name
    public String courseName;

    // Constructor to initialize the course name
    public CourseType(String courseName) {
	   this.courseName = courseName;
    }

    // Abstract method to get course details, to be implemented by subclasses
    public abstract String getCourseDetails();
}