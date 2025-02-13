package com.queueinterface.hospitaltrigesystem;
public class Patient {

    // Creating the attributes named as name and severity
    public String name;
    public int severity;

    // Intilizing the attributes in the constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    // @override the toString method to print the name and severity of the patient
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}