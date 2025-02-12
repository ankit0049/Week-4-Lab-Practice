package com.multilevelcoursemanagementsystem;
import java.util.*;
// Defining a utility class to handle course-related operations
public class CourseUtils {
    // Implementing a method to display details of all courses dynamically using wildcards
    public static void displayAllCourses(List<? extends CourseType> courses) {
	   // Iterating over each course and printing its details
	   for (CourseType course : courses) {
		  System.out.println(course.getCourseDetails());
	   }
    }
}
