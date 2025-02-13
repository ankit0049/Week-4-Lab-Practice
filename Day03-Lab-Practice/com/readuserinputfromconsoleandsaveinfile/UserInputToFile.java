package com.readuserinputfromconsoleandsaveinfile;

import java.io.*;

// Create a class to read user input from the console and save it to a file
public class UserInputToFile {

    // Create a Method to read user input using BufferedReader and save it to a file
    public static void saveUserInput(String filePath) {

        // Create BufferedReader for reading user input
        BufferedReader bufferedReader = null;

        // Create FileWriter for writing data to the file
        FileWriter fileWriter = null;

        try {
            // Initialize BufferedReader to read input from the console
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            // Get the user's name
            System.out.print("Enter your name: ");
            String name = bufferedReader.readLine();

            // Get the user's age
            System.out.print("Enter your age: ");
            String age = bufferedReader.readLine();

            // Get the user's favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String favoriteLanguage = bufferedReader.readLine();

            // Create a File object for the output file
            File outputFile = new File(filePath);

            // Check if the file exists
            if (!outputFile.exists()) {
                // If the file does not exist, create a new file
                boolean isCreated = outputFile.createNewFile();

                // Print an error message if the file could not be created
                if (!isCreated) {
                    System.out.println("Error: failed in creating output file.");
                    return;
                }
            }
            // Initialize FileWriter to write data into the file
            fileWriter = new FileWriter(outputFile);

            // Write user data into the file
            fileWriter.write("User Name is: " + name + "\n");
            fileWriter.write("User Age: " + age + "\n");
            fileWriter.write("User Favorite Programming Language: " + favoriteLanguage + "\n");

            // Print success message
            System.out.println("User data has been saved successfully to the file: " + filePath);

        } catch (IOException e) {
            // Handle input/output exceptions
            System.out.println("Error occurred while handling file operations: " + e.getMessage());

        } finally {
            try {
                // Close BufferedReader if it was opened
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

                // Close FileWriter if it was opened
                if (fileWriter != null) {
                    fileWriter.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the streams
                System.out.println("Error while closing resources: " + e.getMessage());
            }
        }
    }
}
