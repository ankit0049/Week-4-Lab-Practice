package com.bufferdstreamefficientcopyusingreadandwrite;

import java.io.*;

// Creating a Class to copy a file using Buffered Streams
public class BufferedFileCopy {

    // Method to copy a file using BufferedInputStream and BufferedOutputStream
    public static void copyFileWithBuffer(String sourceFilePath, String destinationFilePath) {

        // Creating BufferedInputStream to read from the source file
        BufferedInputStream bufferedInputStream = null;

        // Creating BufferedOutputStream to write into the destination file
        BufferedOutputStream bufferedOutputStream = null;

        // Creating the buffer size as 1 KB (1024 bytes)
        final int BUFFER_SIZE = 1024;

        // Declare a variable to store the execution time
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
            FileInputStream fileInputStream = new FileInputStream(sourceFile);

            // Initialize FileOutputStream to write the file
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);

            // Wrap FileInputStream inside BufferedInputStream for efficient reading
            bufferedInputStream = new BufferedInputStream(fileInputStream, BUFFER_SIZE);

            // Wrap FileOutputStream inside BufferedOutputStream for efficient writing
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream, BUFFER_SIZE);

            // Declare a byte array buffer of size 4 KB (4096 bytes)
            byte[] buffer = new byte[BUFFER_SIZE];

            // Declare a variable to store the number of bytes read
            int bytesRead;

            // Record the start time using System.nanoTime()
            startTime = System.nanoTime();

            // Read the file in chunks of 4 KB and write to the destination file
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }

            // Record the end time after the file copy process is completed
            endTime = System.nanoTime();

            // Calculate the total execution time in milliseconds
            duration = (endTime - startTime) / 1_000_000;

            // Print success message with execution time
            System.out.println("Buffered file copy completed in " + duration + " ms.");

        } catch (IOException e) {
            // Handle general input/output exceptions
            System.out.println("Error occurred during file operation: " + e.getMessage());

        } finally {
            try {
                // Close BufferedInputStream if it was opened
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }

                // Close BufferedOutputStream if it was opened
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the streams
                System.out.println("Error while closing the file: " + e.getMessage());
            }
        }
    }
}
