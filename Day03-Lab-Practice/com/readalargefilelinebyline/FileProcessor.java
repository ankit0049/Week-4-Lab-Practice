package com.readalargefilelinebyline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Class to process a large file and filter lines containing "error"
public class FileProcessor {

    // Method to read a file line by line and print lines containing "error"
    public void processFile(String filePath) {

        // Create a File object for the given path
        File file = new File(filePath);

        // Check if the file exists before proceeding
        if (!file.exists()) {
            System.out.println("Error: The specified file does not exist.");
            return;
        }

        // Declare BufferedReader for reading the file
        BufferedReader bufferedReader = null;

        try {
            // Initialize FileReader to read the file
            FileReader fileReader = new FileReader(file);

            // Wrap FileReader in BufferedReader for efficient reading
            bufferedReader = new BufferedReader(fileReader);

            // Declare a variable to store each line read from the file
            String line;

            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {

                // Convert line to lowercase to perform case-insensitive search
                String lowercaseLine = line.toLowerCase();

                // Check if the line contains the word "error"
                if (lowercaseLine.contains("error")) {
                    // Print the matching line
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            // Handle file read exceptions
            System.out.println("Error: IOException occurred while reading the file - " + e.getMessage());

        } finally {
            try {
                // Close the BufferedReader if it was initialized
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the BufferedReader
                System.out.println("Error: IOException occurred while closing the file - " + e.getMessage());
            }
        }
    }
}
