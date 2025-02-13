package com.smartwarehousemanagementsystem;
// Main class to execute and test the warehouse management system
public class SmartWarehouseSystem {
    public static void main(String[] args) {

	   // Creating storage instances for different item categories
	   Storage<Electronics> electronicsStorage = new Storage<>();
	   Storage<Groceries> groceriesStorage = new Storage<>();
	   Storage<Furniture> furnitureStorage = new Storage<>();


	   // Creating and adding electronic items to the electronics storage
	   electronicsStorage.addItem(new Electronics("Laptop", 4));
	   electronicsStorage.addItem(new Electronics("Smartphone", 2));

	   // Creating and adding grocery items to the groceries storage
	   groceriesStorage.addItem(new Groceries("Milk", "2025-05-10"));
	   groceriesStorage.addItem(new Groceries("Bread", "2025-02-15"));

	   // Creating and adding furniture items to the furniture storage
	   furnitureStorage.addItem(new Furniture("Chair", "Wood"));
	   furnitureStorage.addItem(new Furniture("Table", "Metal"));

	   // Retrieving and displaying all stored items dynamically using wildcard method
	   System.out.println("Electronics Items:");
	   Storage.displayItems(electronicsStorage.getItems());

	   System.out.println("\nGroceries Items:");
	   Storage.displayItems(groceriesStorage.getItems());

	   // Displaying furniture items
	   System.out.println("\nFurniture Items:");
	   Storage.displayItems(furnitureStorage.getItems());
    }
}
