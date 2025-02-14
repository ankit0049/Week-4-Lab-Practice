package com.checkedexception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// Create a class to read file and if not exists then throe the exception
public class FileNotFoundExeptions extends Throwable {
    //Create a method to read file if not exists then throw exception
    public static String checkException(String path){
        try(FileReader fileReader = new FileReader(path)){
            String result = "";
            int a;
            while((a=fileReader.read())!=-1){
                result+= (char)a;
            }
            return result;

        }catch(FileNotFoundException e){
            System.out.println("File Path Invalid Please provide correct path");
        } catch (IOException e) {
            System.out.println("IO exception Occurred");
        }
        return "Works Fine";
    }
    //Main method to control the flow of code.
    public static void main(String[] args){
        // Calling the check
        FileNotFoundExeptions.checkException("data.txt.");
    }

}
