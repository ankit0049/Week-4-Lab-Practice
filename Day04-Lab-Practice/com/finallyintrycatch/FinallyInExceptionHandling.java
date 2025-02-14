package com.finallyintrycatch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

//FinallyInExceptionHandling This class is created for the overview of the finally block.
 public class FinallyInExceptionHandling {
    //Method to perform division and if any exception exist it will display message.
    public static void division(){
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please Enter First Number : ");
            String a = bf.readLine();
            System.out.print("Please Enter Second Number : ");
            String b = bf.readLine();
            int c;
            int d;
            try{
                c = Integer.parseInt(a);
                d = Integer.parseInt(b);
            }catch(Exception e){
                throw new InputMismatchException("InputMismatchException Exception... Please Enter valid Input");
            }
            if(d==0) throw new ArithmeticException("ArithmeticException Exception... Please Enter valid value to perform Division");
            System.out.println("Division value : " + c/d);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("Input/Output exception occurred");
        }catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("OPERATION COMPLETED");
        }

    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        //Calling static method to get the overview of finally block.
        FinallyInExceptionHandling.division();
    }

}
