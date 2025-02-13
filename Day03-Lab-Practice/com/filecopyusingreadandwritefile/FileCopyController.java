package com.filecopyusingreadandwritefile;
public class FileCopyController {
    // Main method to execute the file copy process
    public static void main(String[] args) {

        // Creating the source file path
        String sourcePath = "source.txt";

        // Creating the destination file path to hold the destination file
        String destinationPath = "destination.txt";

        // Call the method to copy the file
        FileCopy.copyTextFile(sourcePath, destinationPath);
    }
}
