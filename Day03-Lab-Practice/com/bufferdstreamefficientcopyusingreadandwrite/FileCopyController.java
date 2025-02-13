package com.bufferdstreamefficientcopyusingreadandwrite;

// Class to test file copy performance
public class FileCopyController {

    // Main method to execute file copy operations
    public static void main(String[] args) {

        // Creating the source file path
        String sourceFile = "source.txt";

        // Creating the destination file path for buffered copy
        String bufferedDestinationPath = "bufferedCopy.txt";

        // Creating the destination file path for unbuffered copy
        String unbufferedDestinationPath = "unbufferedCopy.txt";

        // Perform file copy using Buffered Streams
        BufferedFileCopy.copyFileWithBuffer(sourceFile, bufferedDestinationPath);

        // Perform file copy using Unbuffered Streams
        UnbufferedFileCopy.copyFileWithoutBuffer(sourceFile, unbufferedDestinationPath);
    }
}
