package com.readuserinputfromconsoleandsaveinfile;

// Class to execute the user input and file writing process
public class UserInputController {

    // Main method to run the program
    public static void main(String[] args) {

        // Creating the file path for saving input
        String filePath = "userData.txt";

        // Call the method to read user input and save it to the file
        UserInputToFile.saveUserInput(filePath);
    }
}
