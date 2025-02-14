package com.exceptionprapogation;

import java.util.Scanner;

//ExceptionPropogation This class is created to check the working of exception propogation.
public class ExceptionPropogation {

    //Main method to control the flow of code.
    public static void main(String[] args){
        try{
            ExceptionPropogation.calculateInterest();
        }catch (Exception e){
            System.out.println("Illigal Argument Exception Called,, Kindly enter valid input");
        }
    }

    //Method to calculate interest if values are valid otherwise throws exception to the main class.
    public static void calculateInterest() throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double amount = input.nextDouble();
        System.out.print("Enter the rate : ");
        double rate = input.nextDouble();
        System.out.print("Enter the time: ");
        double time = input.nextDouble();
        if(amount < 0 || rate < 0 || time < 0)
        {
            throw new IllegalArgumentException("trying throws");
        }else{
            System.out.println("Interest : " + (rate*amount*time)/100);
        }
           
    }
}
