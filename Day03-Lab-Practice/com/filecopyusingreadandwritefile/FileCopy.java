package com.filecopyusingreadandwritefile;

import java.io.*;
// Class to read from a text file and write into another file
public class FileCopy {
    
    //Create a method to copy the text using read and write file
    public static void copyTextFile(String sourceFilePath, String destinationFilePath) {
        
        // Create FileInputStream to read from the source file
        FileInputStream fileInputStream = null;
        
        // Create FileOutputStream to write into the destination file
        FileOutputStream fileOutputStream = null;

        try {
            // Create a File object for the source file
            File sourceFile = new File(sourceFilePath);

            // Check if the source file exists before proceeding
            if (!sourceFile.exists()) {
                System.out.println("Error: Source file does not exist.");
                return;
            }

            // Create a File object for the destination file
            File destinationFile = new File(destinationFilePath);

            // Check if the destination file exists
            if (!destinationFile.exists()) {
                // If the destination file does not exist, create a new file
                boolean isCreated = destinationFile.createNewFile();
                
                // Display the message if file creation fails
                if (!isCreated) {
                    System.out.println("Error: Failed to create a file");
                    return;
                }
            }

            // Initialize FileInputStream to read from the source file
            fileInputStream = new FileInputStream(sourceFile);

            // Initialize FileOutputStream to write into the destination file
            fileOutputStream = new FileOutputStream(destinationFile);

            // Create a variable and store the data
            int byteData;

            // Read the source file byte by byte and write to the destination file
            while ((byteData = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteData);
            }

            // Display the message after reading the file
            System.out.println("File content has been copied successfully!");

        } catch (IOException e) {
            // Handle general input/output exceptions
            System.out.println("Error occurred during file operation: " + e.getMessage());

        } finally {
            try {
                // Close FileInputStream if it was opened
                if (fileInputStream != null) {
                    fileInputStream.close();
                }

                // Close FileOutputStream if it was opened
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the streams
                System.out.println("Error while closing the file: " + e.getMessage());
            }
        }
    }
}
