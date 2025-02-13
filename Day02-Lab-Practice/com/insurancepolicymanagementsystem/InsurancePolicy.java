package com.insurancepolicymanagementsystem;

import java.time.LocalDate;

// Represents an insurance policy with essential attributes.
// Implements Comparable to allow sorting based on expiry date.
class InsurancePolicy implements Comparable<InsurancePolicy>{
	// Declaring a private variable to store the unique policy number
	private String policyNumber;

	// Declaring a private variable to store the policyholder's name
	private String policyholderName;

	// Declaring a private variable to store the expiry date of the policy
	private LocalDate expiryDate;

	// Declaring a private variable to store the type of coverage (Health, Auto, Home, etc.)
	private String coverageType;

	// Declaring a private variable to store the premium amount of the policy
	private double premiumAmount;

	// Constructor to initialize an InsurancePolicy object.
	public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
		// Assigning the provided policy number to the class variable
		this.policyNumber = policyNumber;

		// Assigning the provided policyholder name to the class variable
		this.policyholderName = policyholderName;

		// Assigning the provided expiry date to the class variable
		this.expiryDate = expiryDate;

		// Assigning the provided coverage type to the class variable
		this.coverageType = coverageType;

		// Assigning the provided premium amount to the class variable
		this.premiumAmount = premiumAmount;
	}


	// Returns the policy number of the insurance policy.
	public String getPolicyNumber() {
		return policyNumber;
	}

	// Returns the expiry date of the insurance policy.
	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	// Returns the coverage type of the insurance policy.
	public String getCoverageType() {
		return coverageType;
	}


	// Compare policies based on expiry date for TreeSet sorting.
	@Override
	public int compareTo(InsurancePolicy other) {
		return this.expiryDate.compareTo(other.expiryDate);
	}


	// Converts policy details into a readable string format.
	@Override
	public String toString() {
		return "Policy No: " + policyNumber + ", Holder: " + policyholderName +
			   ", Expiry: " + expiryDate + ", Type: " + coverageType + ", Premium: $" + premiumAmount;
	}
}
