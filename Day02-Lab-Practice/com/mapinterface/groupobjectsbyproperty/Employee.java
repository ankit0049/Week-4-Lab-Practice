package com.mapinterface.groupobjectsbyproperty;

import java.util.Objects;

// Employee class representing an employee with a name and department
public class Employee {
    String name;
    String department;

    // Constructor to initialize name and department
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Overriding toString to print employee name instead of object reference
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department);
    }
}