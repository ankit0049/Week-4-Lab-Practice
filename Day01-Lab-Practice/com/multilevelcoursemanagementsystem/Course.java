package com.multilevelcoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Defining a generic class to manage different university courses
public class Course<T extends CourseType> {
    // Declaring a private variable to store the course department
    private String department;

    List<T> courseList = new ArrayList<>();
    // Declaring a private variable to store the course details
    private T courseDetails;

    // Constructor to initialize the course with department and details
    public Course(String department, T courseDetails) {
	   this.department = department;
	   this.courseDetails = courseDetails;

    }

    // Method to add a course to the list
    public void addCourse(T course) {
	   courseList.add(course);
    }

    // Method to get the list of courses
    public List<T> getCourseList() {
	   return courseList;
    }

    // Method to get the department offering the course
    public String getDepartment() {
	   return department;
    }

    // Method to get the details of the course
    public T getCourseDetails() {
	   return courseDetails;
    }

    // Method to return full course information as a string
    public String getFullCourseInfo() {
	   return "Department: " + department + ", " + courseDetails.getCourseDetails();
    }
}