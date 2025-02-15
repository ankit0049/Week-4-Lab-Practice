package com.junit.bankingtransaction;

public class BankAccount {

    // Stores the current account balance.
    private double balance;

    // Constructor initializes the account with a given balance.
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Create a method deposit to Adds a specified amount to the account balance.
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Create a method to Withdraws a specified amount from the balance if funds are sufficient.
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    //Create method to Returns the current balance.
    public double getBalance() {
        return balance;
    }
}
