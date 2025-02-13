package com.mapinterface.groupobjectsbyproperty;

import java.util.*;
public class GroupByDepartment {

    // Method to group employees by their department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        // Creating a HashMap to store department-wise employees
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        // Iterating over each employee
        for (Employee emp : employees) {
            // If department key exists, add employee to list
            // If it doesn't exist, create a new list and add employee
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        // Returning the department-wise grouped employees
        return departmentMap;
    }
}