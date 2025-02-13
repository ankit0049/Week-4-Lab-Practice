package com.queueinterface.hospitaltrigesystem;

import java.util.*;

public class HospitalTriage {
    public static void main(String[] args) {
        // Create a priority queue to manage patient triage based on severity
        PriorityQueue<Patient> pq = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> -p.severity));

        // Add patients to the queue
        pq.add(new Patient("Jay", 1));
        pq.add(new Patient("Viru", 5));
        pq.add(new Patient("Ajay", 9));

        // Process patients based on their severity
        System.out.println("Patient Treatment Order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
