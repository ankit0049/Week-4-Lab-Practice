package com.autoclosingresource;
import java.io.*;
// Creating a  class TryWithResource to implement try-with-resource
public class TryWithResources {
    //Method to read file without closing the resources
    public static void readFile(){
        // Creating a variable to store the filepath
        String filepath = "data.txt";
        // use try with resource to auto close object and free the resource
         try(BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)))){
             int character ;
             while((character = bf.read()) !=-1){
                 System.out.println((char)character);
             }
         }catch(IOException e){
             System.out.println("Error Reading File");
         }

    }
    //Main method to control the flow of code.
    public static void main(String[] args){
        //Calling readFile method to read file without closing the resources
        TryWithResources.readFile();
    }

}
