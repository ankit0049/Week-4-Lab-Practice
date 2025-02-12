package com.multilevelcoursemanagementsystem;

// Defining a subclass for Assignment-Based Courses, extending CourseType
public class AssignmentCourse extends CourseType {
    // Declaring a private variable to store the number of assignments
    private int assignmentCount;

    // Constructor to initialize the assignment-based course with name and assignment count
    public AssignmentCourse(String courseName, int assignmentCount) {
	   super(courseName);
	   this.assignmentCount = assignmentCount;
    }

    // Implementing the method to return details of the assignment-based course
    @Override
    public String getCourseDetails() {
	   return "Assignment Course: " + courseName + ", Number of Assignments: " + assignmentCount;
    }

    public String toString(){
	   return courseName;
    }
}