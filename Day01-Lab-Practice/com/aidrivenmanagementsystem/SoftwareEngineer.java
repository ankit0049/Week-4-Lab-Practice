package com.aidrivenmanagementsystem;

// creating a class for the Software Engineer role extending JobRole
 public class SoftwareEngineer extends JobRole {
    // Constructor to initialize the Software Engineer role
    public SoftwareEngineer() {
	   super("Software Engineer");
    }

    // Implementing the method to specify required skills for this role
    @Override
    public String requiredSkills() {
	   return "Skills: Java, C++, DSA, System Design, Problem Solving";
    }

    public String toString(){
	   return jobTitle;
    }
}