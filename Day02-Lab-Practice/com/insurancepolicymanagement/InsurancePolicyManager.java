package com.insurancepolicymanagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicyManager {
    private Map<String, InsurancePolicy> hashMap = new HashMap<>();
    private Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
    private Map<LocalDate, InsurancePolicy> treeMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
	   hashMap.put(policy.getPolicyNumber(), policy);
	   linkedHashMap.put(policy.getPolicyNumber(), policy);
	   treeMap.put(policy.getExpiryDate(), policy);
    }

    public void retrievePolicyByNumber(String policyNumber) {
	   System.out.println("\nRetrieving Policy by Policy Number: " + policyNumber);
	   if (hashMap.containsKey(policyNumber)) {
		  System.out.println(hashMap.get(policyNumber));
	   } else {
		  System.out.println("Policy not found.");
	   }
    }

    public void listExpiringPolicies() {
	   System.out.println("\nPolicies Expiring in the Next 30 Days:");
	   LocalDate today = LocalDate.now();

	   for (Map.Entry<LocalDate, InsurancePolicy> entry : treeMap.entrySet()) {
		  if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
			 System.out.println(entry.getValue());
		  }
	   }
    }

    public void listPoliciesByPolicyholder(String policyholderName) {
	   System.out.println("\nPolicies for Policyholder: " + policyholderName);
	   for (InsurancePolicy policy : hashMap.values()) {
		  if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
			 System.out.println(policy);
		  }
	   }
    }

    public void removeExpiredPolicies() {
	   System.out.println("\nRemoving Expired Policies:");
	   LocalDate today = LocalDate.now();
	   List<String> expiredPolicyNumbers = new ArrayList<>();

	   for (Map.Entry<LocalDate, InsurancePolicy> entry : treeMap.entrySet()) {
		  if (entry.getKey().isBefore(today)) {
			 expiredPolicyNumbers.add(entry.getValue().getPolicyNumber());
		  }
	   }

	   for (String policyNumber : expiredPolicyNumbers) {
		  hashMap.remove(policyNumber);
		  linkedHashMap.remove(policyNumber);
		  treeMap.entrySet().removeIf(entry -> entry.getValue().getPolicyNumber().equals(policyNumber));
		  System.out.println("Removed Policy No: " + policyNumber);
	   }
    }

    public void displayAllPolicies() {
	   System.out.println("\nAll Policies (Insertion Order):");
	   for (InsurancePolicy policy : linkedHashMap.values()) {
		  System.out.println(policy);
	   }
    }

    // Retrieves a policy by its policy number (for testing)
    public InsurancePolicy getPolicyByNumber(String policyNumber) {
	   return hashMap.get(policyNumber);
    }

    // Returns a list of expiring policies within the next 30 days
    public List<InsurancePolicy> getExpiringPolicies() {
	   LocalDate today = LocalDate.now();
	   List<InsurancePolicy> expiringPolicies = new ArrayList<>();

	   for (Map.Entry<LocalDate, InsurancePolicy> entry : treeMap.entrySet()) {
		  if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
			 expiringPolicies.add(entry.getValue());
		  }
	   }
	   return expiringPolicies;
    }

    // Returns all policies in insertion order
    public List<InsurancePolicy> getAllPolicies() {
	   return new ArrayList<>(linkedHashMap.values());
    }

    // Returns policies belonging to a specific policyholder
    public List<InsurancePolicy> getPoliciesByPolicyholder(String policyholderName) {
	   List<InsurancePolicy> policies = new ArrayList<>();
	   for (InsurancePolicy policy : hashMap.values()) {
		  if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
			 policies.add(policy);
		  }
	   }
	   return policies;
    }

}
