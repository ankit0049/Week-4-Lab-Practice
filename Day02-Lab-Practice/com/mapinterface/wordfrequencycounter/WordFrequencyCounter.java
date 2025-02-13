package com.mapinterface.wordfrequencycounter;

import java.util.*;

public class WordFrequencyCounter {

    // Counts the frequency of each word in the given text.
    public static Map<String, Integer> countWordFrequency(String text) {
        // Create a map to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Convert text to lowercase and split by non-word characters (punctuation, spaces)
        String[] words = text.toLowerCase().split("\\W+");

        // Count the frequency of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}