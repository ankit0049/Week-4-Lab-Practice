package com.pipedstreamsinterthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// Class to execute the inter-thread communication using Piped Streams
public class PipedStreamCommunication {

    // Main method to run the program
    public static void main(String[] args) {


        // Declare PipedInputStream and PipedOutputStream for communication
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        try {
            // Connect the piped input stream to the piped output stream
            pipedOutputStream.connect(pipedInputStream);

            // Create and start the writer thread
            WriterThread writerThread = new WriterThread(pipedOutputStream);
            writerThread.start();

            // Create and start the reader thread
            ReaderThread readerThread = new ReaderThread(pipedInputStream);
            readerThread.start();

        } catch (IOException e) {
            // Handle exceptions related to piped stream connection
            System.out.println("Main Thread: IOException occurred - " + e.getMessage());

        }
    }
}
