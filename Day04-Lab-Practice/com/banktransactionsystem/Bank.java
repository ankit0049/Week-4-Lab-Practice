package com.banktransactionsystem;

//Create a class to manage the account of the user
public class Bank {

    //private attributes
    private int balance;
    private int accountNumber;
    private String name;

    //constructor to set the default value of the balance of user.
    public Bank(String name,int accountNumber){
        this.balance=100;
        this.name=name;
        this.accountNumber=accountNumber;
        System.out.println("Account Created successfully and Intial balance is 100");
    }

    //method to get balance
    public int getBalance(){
        return balance;
    }

    //method to get Name
    public String getName(){
        return name;
    }

    //method to get Account number
    public int getAccountNumber(){
        return accountNumber;
    }

    //method to deposit balance
    public void depositBalance(int depositMoney){
        this.balance=this.balance+depositMoney;
    }

    //method to withdrwal balance with exception handling
    public void withdrawBalance(int withdraw){
        try {
            if (withdraw > getBalance()) {
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            this.balance=this.balance-withdraw;
            System.out.println("Withdrawl successfull of " + withdraw + " ruppess");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //overiding method to string
    @Override
    public String toString(){
        return "Name of Account Holder : "+getName()+" with Account NO : "+getAccountNumber()+" with the account balance of : "+ getBalance();
    }
}
