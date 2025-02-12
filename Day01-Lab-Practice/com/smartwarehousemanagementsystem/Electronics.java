package com.smartwarehousemanagementsystem;

// Defining a subclass for Electronics, extending WarehouseItem
public class Electronics extends WarehouseItem {
    // Declaring a private variable for warranty period of the electronic item
    private int warrantyPeriod;

    // Constructor to initialize the electronics item with name and warranty period
    public Electronics(String name, int warrantyPeriod) {
	   super(name);
	   this.warrantyPeriod = warrantyPeriod;
    }

    // Implementing the method to return details of the electronics item
    @Override
    public String getItemDetails() {
	   return "Electronics: " + name + ", Warranty: " + warrantyPeriod + " years";
    }

    public String toString() {
	   return name ;
    }
}