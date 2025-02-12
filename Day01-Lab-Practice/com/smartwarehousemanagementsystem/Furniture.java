package com.smartwarehousemanagementsystem;

// Defining a subclass for Furniture, extending WarehouseItem
public class Furniture extends WarehouseItem {
    // Declaring a private variable for material type of the furniture item
    private String material;

    // Constructor to initialize the furniture item with name and material type
    public Furniture(String name, String material) {
	   super(name);
	   this.material = material;
    }

    // Implementing the method to return details of the furniture item
    @Override
    public String getItemDetails() {
	   return "Furniture: " + name + ", Material: " + material;
    }

    public String toString() {
	   return name ;
    }
}