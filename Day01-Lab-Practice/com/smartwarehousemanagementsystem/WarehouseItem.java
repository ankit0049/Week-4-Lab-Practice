package com.smartwarehousemanagementsystem;

// Defining an abstract class representing a warehouse item
public abstract class WarehouseItem {
    // Declaring a protected variable to store the item name
    public String name;

    // Constructor to initialize the warehouse item with a name
    public WarehouseItem(String name) {
	   this.name = name;
    }

    // Abstract method to get the item details, to be implemented by subclasses
    public abstract String getItemDetails();
}