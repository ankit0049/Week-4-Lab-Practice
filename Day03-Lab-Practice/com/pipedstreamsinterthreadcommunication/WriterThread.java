package com.pipedstreamsinterthreadcommunication;

import java.io.IOException;
import java.io.PipedOutputStream;

// Class representing the thread that writes data to the pipe
public class WriterThread extends Thread {

    // PipedOutputStream for writing data
    private PipedOutputStream pipedOutputStream;

    // Constructor to initialize the piped output stream
    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    // Run method to write data into the pipe
    public void run() {
        try {
            // Define the message to be written
            String message = "Hello, this is a message from WriterThread.";

            // Convert the message into bytes and write it into the pipe
            pipedOutputStream.write(message.getBytes());

            // Flush the stream to ensure data is sent
            pipedOutputStream.flush();

            // Print a confirmation message
            System.out.println("WriterThread: Message written to the pipe.");

        } catch (IOException e) {
            // Handle exceptions related to piped stream writing
            System.out.println("WriterThread: IOException occurred - " + e.getMessage());

        } finally {
            try {
                // Close the piped output stream if it is not already closed
                if (pipedOutputStream != null) {
                    pipedOutputStream.close();
                }

            } catch (IOException e) {
                // Handle errors while closing the stream
                System.out.println("WriterThread: Error while closing the stream - " + e.getMessage());
            }
        }
    }
}
