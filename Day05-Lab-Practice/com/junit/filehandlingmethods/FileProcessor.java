package com.junit.filehandlingmethods;

import java.io.*;

public class FileProcessor {

    // Create a method to write content inside the file
    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }
    // Create a method to remove the content from the file
    public String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
    }
}
