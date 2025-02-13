package com.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

// Manages insurance policies using HashSet, LinkedHashSet, and TreeSet.

class InsurancePolicyManager {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>();

    // Adds a policy to all sets ensuring uniqueness.
    public void addPolicy(InsurancePolicy policy) {
	   hashSet.add(policy);
	   linkedHashSet.add(policy);
	   treeSet.add(policy);
    }

    // Displays all unique policies from HashSet.
    public void displayAllPolicies() {
	   System.out.println("\nAll Unique Policies:");
	   for (InsurancePolicy policy : hashSet) {
		  System.out.println(policy);
	   }
    }

    // Retrieves and displays policies expiring within the next 30 days.
    public void displayExpiringPolicies() {
	   System.out.println("\nPolicies Expiring in the Next 30 Days:");
	   LocalDate today = LocalDate.now();
	   for (InsurancePolicy policy : treeSet) {
		  if (ChronoUnit.DAYS.between(today, policy.getExpiryDate()) <= 30) {
			 System.out.println(policy);
		  }
	   }
    }

    // Retrieves and displays policies based on a specific coverage type.
    public void displayPoliciesByCoverage(String coverageType) {
	   System.out.println("\nPolicies with Coverage Type: " + coverageType);
	   for (InsurancePolicy policy : hashSet) {
		  if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
			 System.out.println(policy);
		  }
	   }
    }

    // Finds and displays duplicate policies based on policy number.
    public void displayDuplicatePolicies() {
	   System.out.println("\nDuplicate Policies:");
	   Map<String, Integer> policyCount = new HashMap<>();
	   for (InsurancePolicy policy : hashSet) {
		  policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
	   }
	   for (Map.Entry<String, Integer> entry : policyCount.entrySet()) {
		  if (entry.getValue() > 1) {
			 System.out.println("Duplicate Policy Number: " + entry.getKey());
		  }
	   }
    }

    // Compares the performance of different set types.
    public void comparePerformance() {
	   System.out.println("\nPerformance Comparison:");

	   // Measuring add operation time
	   long startTime = System.nanoTime();
	   hashSet.add(new InsurancePolicy("#PO1", "Ankit Rajput", LocalDate.now(), "TestType", 1000));
	   long hashSetTime = System.nanoTime() - startTime;

	   startTime = System.nanoTime();
	   linkedHashSet.add(new InsurancePolicy("#PO2", "Vinay Jadon", LocalDate.now(), "TestType", 1000));
	   long linkedHashSetTime = System.nanoTime() - startTime;

	   startTime = System.nanoTime();
	   treeSet.add(new InsurancePolicy("#PO3", "Udit", LocalDate.now(), "TestType", 1000));
	   long treeSetTime = System.nanoTime() - startTime;

	   System.out.println("HashSet Add Time: " + hashSetTime + " ns");
	   System.out.println("LinkedHashSet Add Time: " + linkedHashSetTime + " ns");
	   System.out.println("TreeSet Add Time: " + treeSetTime + " ns");
    }

    //  Returns all policies in a list (for test verification)
    public List<InsurancePolicy> getAllPolicies() {
	   return new ArrayList<>(hashSet);
    }

    //  Returns policies filtered by coverage type (for test verification)
    public List<InsurancePolicy> getPoliciesByCoverage(String coverageType) {
	   List<InsurancePolicy> filteredPolicies = new ArrayList<>();
	   for (InsurancePolicy policy : hashSet) {
		  if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
			 filteredPolicies.add(policy);
		  }
	   }
	   return filteredPolicies;
    }

    //  Returns policies expiring within a given number of days (for test verification)
    public List<InsurancePolicy> getExpiringPolicies(LocalDate endDate) {
	   List<InsurancePolicy> expiringPolicies = new ArrayList<>();
	   LocalDate today = LocalDate.now();
	   for (InsurancePolicy policy : treeSet) {
		  if (!policy.getExpiryDate().isAfter(endDate) && ChronoUnit.DAYS.between(today, policy.getExpiryDate()) <= 30) {
			 expiringPolicies.add(policy);
		  }
	   }
	   return expiringPolicies;
    }

    // Returns duplicate policies based on policy number (for test verification)
    public List<InsurancePolicy> getDuplicatePolicies() {
	   List<InsurancePolicy> duplicates = new ArrayList<>();
	   Map<String, Integer> policyCount = new HashMap<>();
	   for (InsurancePolicy policy : hashSet) {
		  policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
	   }
	   for (InsurancePolicy policy : hashSet) {
		  if (policyCount.get(policy.getPolicyNumber()) > 1) {
			 duplicates.add(policy);
		  }
	   }
	   return duplicates;
    }
}
