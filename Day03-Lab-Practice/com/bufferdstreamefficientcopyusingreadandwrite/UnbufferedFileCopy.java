package com.bufferdstreamefficientcopyusingreadandwrite;

import java.io.*;

// Class to copy a file using normal (unbuffered) streams
public class UnbufferedFileCopy {

    // Method to copy a file using FileInputStream and FileOutputStream
    public static void copyFileWithoutBuffer(String sourceFilePath, String destinationFilePath) {

        // Declare FileInputStream to read from the source file
        FileInputStream fileInputStream = null;

        // Declare FileOutputStream to write into the destination file
        FileOutputStream fileOutputStream = null;

        // Declare a variable to store execution time
        long startTime, endTime, duration;

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

                // Print appropriate message if file creation fails
                if (!isCreated) {
                    System.out.println("Error: Unable to create destination file.");
                    return;
                }
            }

            // Initialize FileInputStream to read the file
            fileInputStream = new FileInputStream(sourceFile);

            // Initialize FileOutputStream to write the file
            fileOutputStream = new FileOutputStream(destinationFile);

            // Declare a variable to store the read byte data
            int byteData;

            // Record the start time using System.nanoTime()
            startTime = System.nanoTime();

            // Read the file byte by byte and write to the destination file
            while ((byteData = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteData);
            }

            // Record the end time after the file copy process is completed
            endTime = System.nanoTime();

            // Calculate the total execution time in milliseconds
            duration = (endTime - startTime) / 1_000_000;

            // Print success message with execution time
            System.out.println("Unbuffered file copy completed in " + duration + " ms.");

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
