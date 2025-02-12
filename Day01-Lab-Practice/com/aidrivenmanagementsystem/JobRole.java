package com.aidrivenmanagementsystem;

//Creating a abstract class named as JobRole
public abstract class JobRole {
    // Declaring a protected variable to store the job title
    public String jobTitle;

    // Constructor to initialize the job role with a title
    public JobRole(String jobTitle) {
	   this.jobTitle = jobTitle;
    }

    // Abstract method to be implemented by specific job roles to describe required skills
    public abstract String requiredSkills();
}