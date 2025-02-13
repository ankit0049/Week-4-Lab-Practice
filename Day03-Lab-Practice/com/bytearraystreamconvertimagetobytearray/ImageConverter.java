package com.bytearraystreamconvertimagetobytearray;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

// Class to handle conversion of an image to a byte array and writing it back to a file
public class ImageConverter {

    // Method to convert an image file into a byte array
    public static byte[] convertImageToByteArray(String imagePath) {

        // Declare a byte array to store image data
        byte[] imageBytes = null;

        try {
            // Read the entire image file into a byte array
            imageBytes = Files.readAllBytes(new File(imagePath).toPath());

            // Print success message after reading
            System.out.println("Image successfully converted to byte array.");

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error while converting image to byte array: " + e.getMessage());
        }

        // Return the byte array containing image data
        return imageBytes;
    }

    // Method to write a byte array back into an image file
    public static void writeByteArrayToImage(byte[] imageBytes, String outputPath) {

        // Declare FileOutputStream for writing byte data to a file
        FileOutputStream fileOutputStream = null;

        try {
            // Initialize FileOutputStream with the output file path
            fileOutputStream = new FileOutputStream(outputPath);

            // Write the byte array data into the file
            fileOutputStream.write(imageBytes);

            // Print success message after writing
            System.out.println("Byte array successfully written to file: " + outputPath);

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error while writing byte array to image file: " + e.getMessage());

        } finally {
            try {
                // Close FileOutputStream if it was opened
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                // Handle errors while closing the stream
                System.out.println("Error while closing FileOutputStream: " + e.getMessage());
            }
        }
    }

    // Method to verify if two image files are identical by comparing byte arrays
    public static boolean verifyImages(String originalPath, String newPath) {

        try {
            // Read byte arrays from both image files
            byte[] originalBytes = Files.readAllBytes(new File(originalPath).toPath());
            byte[] newBytes = Files.readAllBytes(new File(newPath).toPath());

            // Compare the byte arrays and return true if they are identical
            return Arrays.equals(originalBytes, newBytes);

        } catch (IOException e) {
            // Handle exceptions related to file operations
            System.out.println("Error while verifying images: " + e.getMessage());
        }

        // Return false if any error occurs
        return false;
    }
}
