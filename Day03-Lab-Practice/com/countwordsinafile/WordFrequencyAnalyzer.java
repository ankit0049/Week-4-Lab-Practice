package com.countwordsinafile;

import java.util.Map;

// Creating a Class to initiate word counting in a file
public class WordFrequencyAnalyzer {

    // Main method to start execution
    public static void main(String[] args) {

        // Define the path of the text file
        String filePath = "source.txt";

        // Create an instance of WordCounter
        WordCounter wordCounter = new WordCounter();

        // Call the method to count words in the file
        wordCounter.countWords(filePath);
    }
}


