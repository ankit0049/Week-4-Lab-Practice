package com.exceptionprapogationinmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Created a class named ExceptionPropogationInMethod for the overview of the method level propogation of the exception.
public class ExceptionPrapogationInMethod {
    //Method to perform division and if any exception exist it will throw exception.
    public static int division1(int number1 , int number2) throws ArithmeticException{
          if(number2 == 0){
              throw  new ArithmeticException("Not possible to divide number with 0");
          }
          return (number1/number2);
    }

    //Method 2 will accept the exception from method1 and throw back to the main method
    public static void division2(int number1 , int number2) throws ArithmeticException{
        try{
            ExceptionPrapogationInMethod.division1(number1 ,number2);
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw new ArithmeticException("Arithmatic exception Caught in the division2");
        }
    }

    //Main method will accept the propogated exception hereA
    public static void main(String[] args){


        try{
            // Creating the scanner object to get the user input
            Scanner sc = new Scanner(System.in);

            // Create variable and get the user input
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();

            ExceptionPrapogationInMethod.division2(number1 , number2);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Catching the exception in the main method");
        }

    }
}
