package com.junit.beforeeachandaftereach;

public class DatabaseConnection {

    // Variable to track connection status.
    private boolean isConnected;

    // Create a method and set the database connection as true
    public void connect() {
        isConnected = true;
    }

    // Create a ,method and set the database connection as false
    public void disconnect() {
        isConnected = false;
    }

    // Crete a getter method to Returns the current connection status.
    public boolean checkConnected() {
        return isConnected;
    }

    // Create a setter method to set the connection status
    public void setConnected(boolean status){
        this.isConnected = status;
    }
}
