package com.multilevelcoursemanagementsystem;// Main class to execute and test the university course management system
import java.util.*;

public class UniversityCourseSystem {
    public static void main(String[] args) {
	   // Creating instances of different course types
	   ExamCourse dataStructures = new ExamCourse("Data Structures", 70);
	   AssignmentCourse webDevelopment = new AssignmentCourse("Web Development", 5);
	   ResearchCourse aiResearch = new ResearchCourse("Artificial Intelligence", "Machine Learning Applications");

	   // Creating instances of courses assigned to departments
	   Course<ExamCourse> csExamCourse = new Course<>("Computer Science", dataStructures);
	   Course<AssignmentCourse> itAssignmentCourse = new Course<>("Information Technology", webDevelopment);
	   Course<ResearchCourse> aiResearchCourse = new Course<>("Artificial Intelligence", aiResearch);

	   // Displaying course details individually
	   System.out.println("Course Details:");
	   System.out.println(csExamCourse.getFullCourseInfo());
	   System.out.println(itAssignmentCourse.getFullCourseInfo());
	   System.out.println(aiResearchCourse.getFullCourseInfo());

	   // Storing all courses in a list using wildcards
	   List<CourseType> allCourses = new ArrayList<>();
	   allCourses.add(dataStructures);
	   allCourses.add(webDevelopment);
	   allCourses.add(aiResearch);

	   // Displaying details of all courses using the utility method
	   System.out.println("\nDisplaying All Courses:");
	   CourseUtils.displayAllCourses(allCourses);
    }
}
