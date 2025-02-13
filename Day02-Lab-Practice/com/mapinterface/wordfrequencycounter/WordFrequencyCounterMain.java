package com.mapinterface.wordfrequencycounter;
import static com.mapinterface.wordfrequencycounter.WordFrequencyCounter.countWordFrequency;

class WordFrequencyCounterMain {
    public static void main(String[] args) {

        // Test case 1: Basic input
        String input = "Ankit Rajput, Vinay Rajput, Ankit Rajput, !";

        // Output: {hello=2, world=1, java=1}
        System.out.println(countWordFrequency(input));
    }
}
