package com.serializationsaveandretrive;

import java.io.*;

// Class representing an Employee, implementing Serializable for object serialization
public class Employee implements Serializable {

    // Unique identifier for ensuring class compatibility during deserialization
    private static final long serialVersionUID = 1L;

    // Creating variables and store the data like name , id and department
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor to initialize Employee object with given values
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployee() {
        System.out.println(" Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------------");
    }
}
