package com.bankingmanagementsystem;
public class BankingSystemMain {
	public static void main(String[] args) {
		// Creating an instance of BankingSystem
		BankingSystem bankingSystem = new BankingSystem();

		// Adding customer accounts
		bankingSystem.addCustomerAccount("A24", 1000.00);
		bankingSystem.addCustomerAccount("B05", 1500.00);
		bankingSystem.addCustomerAccount("C78", 2000.00);
		bankingSystem.addCustomerAccount("D90", 500.00);

		// Displaying customers sorted by balance
		bankingSystem.displayCustomersSortedByBalance();

		// Adding withdrawal requests
		bankingSystem.addWithdrawalRequest("A24", 200.00);
		bankingSystem.addWithdrawalRequest("B05", 1600.00);
		bankingSystem.addWithdrawalRequest("C78", 500.00);
		bankingSystem.addWithdrawalRequest("D90", 100.00);

		// Processing withdrawal requests
		bankingSystem.processWithdrawals();

		// Displaying customer balances after withdrawals
		bankingSystem.displayCustomerBalance("A24");
		bankingSystem.displayCustomerBalance("B05");
		bankingSystem.displayCustomerBalance("C78");
		bankingSystem.displayCustomerBalance("D90");
	}
}
