package com.banktransactionsystem;

// Create a class to make method call using object and manage the system
public class BankTransactionSystem {

    public static void main(String[] args){
        Bank ankit = new Bank("Ankit Rajput",1897564);

        // Displaying the details
        System.out.println(ankit.getName());
        System.out.println(ankit.getAccountNumber());
        System.out.println(ankit.getBalance());
        System.out.println(ankit);

        // Performing operation on ankit account
        ankit.depositBalance(100);
        ankit.withdrawBalance(1000);
        ankit.depositBalance(100);
        ankit.withdrawBalance(1000);
    }

}
