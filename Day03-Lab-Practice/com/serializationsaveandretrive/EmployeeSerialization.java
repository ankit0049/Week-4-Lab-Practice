package com.serializationsaveandretrive;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Class to handle serialization and deserialization of Employee objects
public class EmployeeSerialization {

    // Method to serialize a list of employees and save to a file
    public static void saveEmployeesToFile(List<Employee> employeeList, String filePath) {

        // Declare ObjectOutputStream for writing objects to a file
        ObjectOutputStream objectOutputStream = null;

        try {
            // Initialize ObjectOutputStream with FileOutputStream to write objects to file
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

            // Write the list of employees to the file
            objectOutputStream.writeObject(employeeList);

            // Print success message after serialization
            System.out.println("Employee list has been successfully serialized to file: " + filePath);

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error occurred while serializing employees: " + e.getMessage());

        } finally {
            try {
                // Close ObjectOutputStream if it was opened
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                // Handle errors while closing the stream
                System.out.println("Error while closing ObjectOutputStream: " + e.getMessage());
            }
        }
    }

    // Method to deserialize the list of employees from a file and return the list
    public static List<Employee> loadEmployeesFromFile(String filePath) {

        // Declare ObjectInputStream for reading objects from a file
        ObjectInputStream objectInputStream = null;

        // Declare a list to store deserialized employees
        List<Employee> employeeList = null;

        try {
            // Initialize ObjectInputStream with FileInputStream to read objects from file
            objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

            // Read the object (list of employees) from the file and cast it to correct type
            employeeList = (List<Employee>) objectInputStream.readObject();

            // Print success message after deserialization
            System.out.println("Employee list has been successfully deserialized from file: " + filePath);

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error occurred while deserializing employees: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            // Handle exceptions if the class definition is not found during deserialization
            System.out.println("Error: Class definition not found while deserializing: " + e.getMessage());

        } finally {
            try {
                // Close ObjectInputStream if it was opened
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                // Handle errors while closing the stream
                System.out.println("Error while closing ObjectInputStream: " + e.getMessage());
            }
        }

        // Return the deserialized list of employees (or null if an error occurred)
        return employeeList;
    }
}
