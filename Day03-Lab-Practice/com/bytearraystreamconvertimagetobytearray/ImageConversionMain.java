package com.bytearraystreamconvertimagetobytearray;

// Class to execute the image conversion and verification process
public class ImageConversionMain {

    // Main method to run the program
    public static void main(String[] args) {

        // Define the input image file path
        String inputImagePath = "input.webp";

        // Define the output image file path
        String outputImagePath = "output.webp";

        // Convert the image to a byte array
        byte[] imageBytes = ImageConverter.convertImageToByteArray(inputImagePath);

        // Check if conversion was successful
        if (imageBytes != null) {

            // Write the byte array back to a new image file
            ImageConverter.writeByteArrayToImage(imageBytes, outputImagePath);

            // Verify if the new image is identical to the original
            if (ImageConverter.verifyImages(inputImagePath, outputImagePath)) {
                System.out.println("Verification successful: The new image is identical to the original.");
            } else {
                System.out.println("Verification failed: The images are not identical.");
            }
        } else {
            // Print message if the image could not be read
            System.out.println("Failed to read the input image.");
        }
    }
}
