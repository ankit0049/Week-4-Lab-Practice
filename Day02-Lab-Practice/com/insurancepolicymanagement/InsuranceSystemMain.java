package com.insurancepolicymanagement;


import java.time.LocalDate;

// Creating the InsuranceSystemMain class to demonstrate the functionality of the insurance policy management system
public class InsuranceSystemMain {
	public static void main(String[] args) {
		// Creating an instance of InsurancePolicyManager to manage policies
		InsurancePolicyManager manager = new InsurancePolicyManager();

		// Adding sample policies to the system
		manager.addPolicy(new InsurancePolicy("PA01", "Ankit", LocalDate.of(2025, 5, 15), 1200));
		manager.addPolicy(new InsurancePolicy("PA02", "Rajput", LocalDate.of(2024, 3, 10), 1500));
		manager.addPolicy(new InsurancePolicy("PA03", "Abhishek", LocalDate.of(2024, 2, 25), 1800));
		manager.addPolicy(new InsurancePolicy("PA04", "Ajeet", LocalDate.of(2024, 4, 5), 1100));

		// Displaying all policies
		manager.displayAllPolicies();

		// Retrieving a policy by policy number
		manager.retrievePolicyByNumber("PA02");

		// Listing policies expiring within the next 30 days
		manager.listExpiringPolicies();

		// Listing policies for a specific policyholder
		manager.listPoliciesByPolicyholder("Ankit");

		// Removing expired policies
		manager.removeExpiredPolicies();

		// Displaying all policies after removing expired ones
		manager.displayAllPolicies();
	}
}