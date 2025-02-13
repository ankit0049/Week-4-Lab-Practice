package com.insurancepolicymanagement;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Represents an insurance policy with essential attributes.
public class InsurancePolicy implements Comparable<InsurancePolicy> {
	// Declaring a private variable to store the unique policy number
	private String policyNumber;

	// Declaring a private variable to store the policyholder's name
	private String policyholderName;

	// Declaring a private variable to store the expiry date of the policy
	private LocalDate expiryDate;

	// Declaring a private variable to store the premium amount
	private double premiumAmount;

	// Constructor to initialize an InsurancePolicy object.
	public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, double premiumAmount) {
		// Assigning the provided policy number to the class variable
		this.policyNumber = policyNumber;

		// Assigning the provided policyholder name to the class variable
		this.policyholderName = policyholderName;

		// Assigning the provided expiry date to the class variable
		this.expiryDate = expiryDate;

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

	// Returns the policyholder name of the insurance policy.

	public String getPolicyholderName() {
		return policyholderName;
	}

	// Compare policies based on expiry date for TreeMap sorting.

	@Override
	public int compareTo(InsurancePolicy other) {
		// Comparing expiry dates to allow sorting in TreeMap based on the expiry date
		return this.expiryDate.compareTo(other.expiryDate);
	}

	// Converts policy details into a readable string format.

	@Override
	public String toString() {
		// Returning a formatted string with the policy details
		return "Policy No: " + policyNumber + ", Holder: " + policyholderName +
			   ", Expiry: " + expiryDate + ", Premium: " + premiumAmount;
	}

    public double getPremiumAmount() {
	    return premiumAmount;
    }


}
