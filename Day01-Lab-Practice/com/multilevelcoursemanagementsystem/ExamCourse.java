package com.multilevelcoursemanagementsystem;

// Defining a subclass for Exam-Based Courses, extending CourseType
public class ExamCourse extends CourseType {
    // Declaring a private variable to store the exam weightage
    private int examWeightage;

    // Constructor to initialize the exam course with name and weightage
    public ExamCourse(String courseName, int examWeightage) {
	   super(courseName);
	   this.examWeightage = examWeightage;
    }

    // Implementing the method to return details of the exam-based course
    @Override
    public String getCourseDetails() {
	   return "Exam Course: " + courseName + ", Exam Weightage: " + examWeightage + "%";
    }

    public String toString(){
	   return courseName;
    }
}
