package com.filterstreamsconvertuppercasetolowercase;

// Class to execute the file conversion
public class LowercaseConversionMain {

    // Main method to run the program
    public static void main(String[] args) {

        // Define the input file path
        String inputFilePath = "source.txt";

        // Define the output file path
        String outputFilePath = "destination.txt";

        // Call the method to convert the text file to lowercase
        LowercaseConverter.convertFileToLowercase(inputFilePath, outputFilePath);
    }
}
