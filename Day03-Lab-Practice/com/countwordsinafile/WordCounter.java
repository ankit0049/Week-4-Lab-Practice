package com.countwordsinafile;

import java.io.*;
import java.util.*;

// Class to count word occurrences and find the top 5 most frequent words
public class WordCounter {

    // Method to process the file and count word occurrences
    public void countWords(String filePath) {

        // Create a File object for the given file path
        File file = new File(filePath);

        // Check if the file exists before proceeding
        if (!file.exists()) {
            System.out.println("Error: file path not found.");
            return;
        }

        // Declare BufferedReader for reading the file
        BufferedReader bufferedReader = null;

        // Declare a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try {
            // Initialize FileReader to read the file
            FileReader fileReader = new FileReader(file);

            // Wrap FileReader in BufferedReader for efficient reading
            bufferedReader = new BufferedReader(fileReader);

            // Declare a variable to store each line read from the file
            String line;

            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {

                // Convert the line to lowercase to ensure case insensitivity
                line = line.toLowerCase();

                // Remove punctuation and split the line into words
                String[] words = line.replaceAll("[^a-zA-Z ]", "").split("\\s+");

                // Iterate through each word
                for (String word : words) {

                    // Skip empty words (due to multiple spaces)
                    if (word.isEmpty()) {
                        continue;
                    }

                    // Update word frequency in the HashMap
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            // Sort the words by their frequency in descending order
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFrequencyMap.entrySet());

            // Use Comparator to sort based on word frequency
            sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            // Print the total number of words in the file
            int totalWords = wordFrequencyMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total number of words in the file: " + totalWords);

            // Print the top 5 most frequent words
            System.out.println("\nTop 5 most frequently occurring words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWords) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
                if (count == 5) {
                    break;
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
