package com.smartwarehousemanagementsystem;
import java.util.*;
// Defining a generic class to store warehouse items safely
public class Storage<T extends WarehouseItem> {
    // Declaring a private list to store warehouse items of type T
    private List<T> items;

    // Constructor to initialize the storage list
    public Storage() {
	   this.items = new ArrayList<>();
    }

    // Method to add an item to the storage
    public void addItem(T item) {
	   items.add(item);
    }

    // Method to retrieve all stored items in the warehouse
    public List<T> getItems() {
	   return items;
    }

    // Method to display all items in the storage using a wildcard
    public static void displayItems(List<? extends WarehouseItem> items) {
	   // Looping through the list and displaying details of each warehouse item
	   for (WarehouseItem item : items) {
		  System.out.println(item.getItemDetails());
	   }
    }
}
