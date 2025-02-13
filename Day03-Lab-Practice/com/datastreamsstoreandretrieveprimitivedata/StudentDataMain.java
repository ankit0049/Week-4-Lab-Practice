package com.datastreamsstoreandretrieveprimitivedata;

// Class to execute storing and retrieving student details
public class StudentDataMain {

    // Main method to run the program
    public static void main(String[] args) {

        // Define the binary file path
        String filePath = "studentData.dat";

        // Store student details in the binary file
        StudentDataHandler.storeStudentData(filePath, 24, "Ankitt", 8.78);

        // Retrieve student details from the binary file
        StudentDataHandler.retrieveStudentData(filePath);
    }
}
