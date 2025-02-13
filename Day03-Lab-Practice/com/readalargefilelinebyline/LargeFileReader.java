package com.readalargefilelinebyline;

// Class to initiate file processing
public class LargeFileReader {

    // Main method to start execution
    public static void main(String[] args) {

        // Define the path of the large text file
        String filePath = "largeFileText.txt";

        // Create an instance of FileProcessor
        FileProcessor fileProcessor = new FileProcessor();

        // Call the method to process the file
        fileProcessor.processFile(filePath);
    }
}
