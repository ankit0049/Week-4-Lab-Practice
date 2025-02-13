package com.bankingmanagementsystem;

import java.util.*;

public class BankingSystem {
    // HashMap to store customer accounts (Account Number -> Balance)
    private Map<String, Double> customerAccounts = new HashMap<>();

    // TreeMap to store customers sorted by their balance (Balance -> Account Number)
    private Map<Double, String> customersSortedByBalance = new TreeMap<>();

    // Queue to process withdrawal requests (Account Number -> Withdrawal Amount)
    private Queue<Map.Entry<String, Double>> withdrawalRequests = new LinkedList<>();

    // Adds a customer account with an initial balance.
    public void addCustomerAccount(String accountNumber, double initialBalance) {
	   customerAccounts.put(accountNumber, initialBalance);
	   customersSortedByBalance.put(initialBalance, accountNumber);
    }

    // Processes a withdrawal request by adding it to the withdrawal queue.
    public void addWithdrawalRequest(String accountNumber, double amount) {
	   withdrawalRequests.offer(new AbstractMap.SimpleEntry<>(accountNumber, amount));
    }

    // Processes all withdrawal requests in the queue.
    public void processWithdrawals() {
	   while (!withdrawalRequests.isEmpty()) {
		  Map.Entry<String, Double> request = withdrawalRequests.poll();
		  String accountNumber = request.getKey();
		  double amount = request.getValue();

		  if (customerAccounts.containsKey(accountNumber)) {
			 double currentBalance = customerAccounts.get(accountNumber);

			 if (currentBalance >= amount) {
				currentBalance -= amount;
				customerAccounts.put(accountNumber, currentBalance);
				System.out.println("Withdrawal successful from account: " + accountNumber + " | Amount: " + amount);
			 } else {
				System.out.println("Insufficient balance for account: " + accountNumber);
			 }
		  } else {
			 System.out.println("Account not found: " + accountNumber);
		  }
	   }
    }

    // Displays all customer accounts sorted by balance using TreeMap.
    public void displayCustomersSortedByBalance() {
	   System.out.println("\nCustomers Sorted by Balance (TreeMap):");
	   for (Map.Entry<Double, String> entry : customersSortedByBalance.entrySet()) {
		  String accountNumber = entry.getValue();
		  double balance = entry.getKey();
		  System.out.println("Account: " + accountNumber + ", Balance: " + balance);
	   }
    }

    // Displays the balance of a specific customer account.
    public void displayCustomerBalance(String accountNumber) {
	   if (customerAccounts.containsKey(accountNumber)) {
		  System.out.println("\nAccount: " + accountNumber + ", Balance: " + customerAccounts.get(accountNumber));
	   } else {
		  System.out.println("\nAccount not found: " + accountNumber);
	   }
    }

    // Retrieves the balance of a specific customer account for testing purposes.
    public double getCustomerBalance(String accountNumber) {
	   return customerAccounts.getOrDefault(accountNumber, -1.0); // Returns -1.0 if account not found
    }
}
