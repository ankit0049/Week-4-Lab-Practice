package com.aidrivenmanagementsystem;

import java.util.ArrayList;
import java.util.List;

// creating a generic class to process resumes for different job roles
public class Resume<T extends JobRole> {
    // Declaring a private variable to store the applicant's name
    private String applicantName;

    // Declaring a private variable to store the job role for which the resume is submitted
    private T jobRole;

    List<T> jobRoles = new ArrayList<>();

    // Constructor to initialize the resume with applicant name and job role
    public Resume(String applicantName, T jobRole) {
	   this.applicantName = applicantName;
	   this.jobRole = jobRole;
    }


    public void addJobRole(T jobRole) {
	   jobRoles.add(jobRole);
    }

    public List<T> getJobRolesList()
    {
	   return jobRoles;
    }
    // Method to get the applicant's name
    public String getApplicantName() {
	   return applicantName;
    }

    // Method to get the job role for which the resume is submitted
    public T getJobRole() {
	   return jobRole;
    }

    // Method to return resume details as a string
    public String getResumeDetails() {
	   return "Applicant: " + applicantName + ", Applied for: " + jobRole.jobTitle + "\n" + jobRole.requiredSkills();
    }
}