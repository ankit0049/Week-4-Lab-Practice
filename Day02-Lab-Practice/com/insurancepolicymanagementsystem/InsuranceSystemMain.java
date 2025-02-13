package com.insurancepolicymanagementsystem;

import java.time.LocalDate;

// Main class to test the Insurance Policy Management System.
public class InsuranceSystemMain {
	public static void main(String[] args) {
		InsurancePolicyManager manager = new InsurancePolicyManager();

		// Adding sample policies
		manager.addPolicy(new InsurancePolicy("P001", "Ankit", LocalDate.of(2025, 2, 15), "Health", 1200));
		manager.addPolicy(new InsurancePolicy("P002", "Rajput", LocalDate.of(2024, 8, 10), "Auto", 1500));
		manager.addPolicy(new InsurancePolicy("P003", "Ajeet", LocalDate.of(2024, 9, 25), "Home", 1800));
		manager.addPolicy(new InsurancePolicy("P004", "David", LocalDate.of(2024, 7, 5), "Health", 1100));
		manager.addPolicy(new InsurancePolicy("P004", "Abdul", LocalDate.of(2024, 4, 5), "Health", 1100));

		// Displaying policies
		manager.displayAllPolicies();
		manager.displayExpiringPolicies();
		manager.displayPoliciesByCoverage("Health");
		manager.displayDuplicatePolicies();

		// Performance comparison
		manager.comparePerformance();
	}
}
