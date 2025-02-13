package com.pipedstreamsinterthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;

// Class representing the thread that reads data from the pipe
public class ReaderThread extends Thread {

    // PipedInputStream for reading data
    private PipedInputStream pipedInputStream;

    // Constructor to initialize the piped input stream
    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    // Run method to read data from the pipe
    public void run() {
        try {
            // Declare a byte array buffer to store incoming data
            byte[] buffer = new byte[1024];

            // Read data from the pipe into the buffer
            int bytesRead = pipedInputStream.read(buffer);

            // Convert the received bytes into a string
            String receivedMessage = new String(buffer, 0, bytesRead);

            // Print the received message
            System.out.println("ReaderThread: Received Message - " + receivedMessage);

        } catch (IOException e) {
            // Handle exceptions related to piped stream reading
            System.out.println("ReaderThread: IOException occurred - " + e.getMessage());

        } finally {
            try {
                // Close the piped input stream if it is not already closed
                if (pipedInputStream != null) {
                    pipedInputStream.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the stream
                System.out.println("ReaderThread: Error while closing the stream - " + e.getMessage());
            }
        }
    }
}
