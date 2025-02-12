package com.multilevelcoursemanagementsystem;

// Defining a subclass for Research-Based Courses, extending CourseType
public class ResearchCourse extends CourseType {
    // Declaring a private variable to store the research topic
    private String researchTopic;

    // Constructor to initialize the research-based course with name and research topic
    public ResearchCourse(String courseName, String researchTopic) {
	   super(courseName);
	   this.researchTopic = researchTopic;
    }

    // Implementing the method to return details of the research-based course
    @Override
    public String getCourseDetails() {
	   return "Research Course: " + courseName + ", Research Topic: " + researchTopic;
    }

    public String toString(){
	   return courseName;
    }
}