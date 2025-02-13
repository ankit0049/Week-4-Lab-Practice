package com.datastreamsstoreandretrieveprimitivedata;

import java.io.*;

// Class to handle storing and retrieving student details
public class StudentDataHandler {

    // Method to store student details in a binary file
    public static void storeStudentData(String filePath, int rollNumber, String name, double gpa) {

        // Declare DataOutputStream for writing primitive data
        DataOutputStream dataOutputStream = null;

        try {
            // Initialize FileOutputStream with the given file path
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

            // Initialize DataOutputStream for writing primitive data
            dataOutputStream = new DataOutputStream(fileOutputStream);

            // Write the student's roll number as an integer
            dataOutputStream.writeInt(rollNumber);

            // Write the student's name as a UTF-encoded string
            dataOutputStream.writeUTF(name);

            // Write the student's GPA as a double
            dataOutputStream.writeDouble(gpa);

            // Print success message after writing data
            System.out.println("Student details successfully stored in file: " + filePath);

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error while storing student details: " + e.getMessage());

        } finally {
            try {
                // Close DataOutputStream if it was opened
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the stream
                System.out.println("Error while closing file resources: " + e.getMessage());
            }
        }
    }

    // Method to retrieve student details from a binary file
    public static void retrieveStudentData(String filePath) {

        // Declare DataInputStream for reading primitive data
        DataInputStream dataInputStream = null;

        try {
            // Initialize FileInputStream with the given file path
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Initialize DataInputStream for reading primitive data
            dataInputStream = new DataInputStream(fileInputStream);

            // Read the student's roll number as an integer
            int rollNumber = dataInputStream.readInt();

            // Read the student's name as a UTF-encoded string
            String name = dataInputStream.readUTF();

            // Read the student's GPA as a double
            double gpa = dataInputStream.readDouble();

            // Print the retrieved student details
            System.out.println("Student Details Retrieved:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error while retrieving student details: " + e.getMessage());

        } finally {
            try {
                // Close DataInputStream if it was opened
                if (dataInputStream != null) {
                    dataInputStream.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the stream
                System.out.println("Error while closing file resources: " + e.getMessage());
            }
        }
    }
}
