package com.filterstreamsconvertuppercasetolowercase;

import java.io.*;

// Class to handle conversion of uppercase text to lowercase
public class LowercaseConverter {

    // Method to convert uppercase letters to lowercase and write to a new file
    public static void convertFileToLowercase(String inputFilePath, String outputFilePath) {

        // Declare FileReader and BufferedReader for reading the file
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        // Declare FileWriter and BufferedWriter for writing the converted text
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            // Initialize FileReader with the input file
            fileReader = new FileReader(inputFilePath);

            // Initialize BufferedReader for efficient reading
            bufferedReader = new BufferedReader(fileReader);

            // Initialize FileWriter with the output file
            fileWriter = new FileWriter(outputFilePath);

            // Initialize BufferedWriter for efficient writing
            bufferedWriter = new BufferedWriter(fileWriter);

            // Declare a variable to store each line of text
            String line;

            // Read each line from the input file
            while ((line = bufferedReader.readLine()) != null) {

                // Convert the line to lowercase
                String lowercaseLine = line.toLowerCase();

                // Write the converted line to the output file
                bufferedWriter.write(lowercaseLine);

                // Add a newline character to maintain formatting
                bufferedWriter.newLine();
            }

            // Print success message after conversion
            System.out.println("Conversion to lowercase completed. Output file: " + outputFilePath);

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error during file conversion: " + e.getMessage());

        } finally {
            try {
                // Close BufferedReader if it was opened
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

                // Close BufferedWriter if it was opened
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }

            } catch (IOException e) {
                // Handle errors while closing streams
                System.out.println("Error while closing file resources: " + e.getMessage());
            }
        }
    }
}
