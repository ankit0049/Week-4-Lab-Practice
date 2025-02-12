package com.aidrivenmanagementsystem;

// Creating a Class DataScientirdta that extends JobRole
public class DataScientist extends JobRole {
    // Constructor to initialize the Data Scientist role
    public DataScientist() {
	   super("Data Scientist");
    }

    // Implementing the method to specify required skills for this role
    @Override
    public String requiredSkills() {
	   return "Skills: Python, Machine Learning, Data Analysis, Deep Learning";
    }

    public String toString(){
	   return jobTitle;
    }
}