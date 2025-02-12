package com.smartwarehousemanagementsystem;

// Defining a subclass for Groceries, extending WarehouseItem
public class Groceries extends WarehouseItem {
    // Declaring a private variable for expiry date of the grocery item
    private String expiryDate;

    // Constructor to initialize the grocery item with name and expiry date
    public Groceries(String name, String expiryDate) {
	   super(name);
	   this.expiryDate = expiryDate;
    }

    // Implementing the method to return details of the grocery item
    @Override
    public String getItemDetails() {
	   return "Groceries: " + name + ", Expiry Date: " + expiryDate;
    }

    public String toString() {
	   return name ;
    }
}