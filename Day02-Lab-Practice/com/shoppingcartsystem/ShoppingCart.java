package com.shoppingcartsystem;

import java.util.*;

public class ShoppingCart {
    // HashMap to store products and their prices
    private Map<String, Integer> productPriceMap = new HashMap<>();

    // LinkedHashMap to maintain the order in which products were added
    private Map<String, Integer> productOrderMap = new LinkedHashMap<>();

    // TreeMap to sort products based on price
    private TreeMap<Integer, List<String>> productSortedByPrice = new TreeMap<>();

    // Method to add a product to the cart
    public void addProduct(String productName, int price) {
	   // Remove the product from the sorted price map if it already exists
	   if (productPriceMap.containsKey(productName)) {
		  int oldPrice = productPriceMap.get(productName);
		  productSortedByPrice.get(oldPrice).remove(productName);
		  if (productSortedByPrice.get(oldPrice).isEmpty()) {
			 productSortedByPrice.remove(oldPrice);
		  }
	   }

	   // Add/Update the product in all data structures
	   productPriceMap.put(productName, price);
	   productOrderMap.put(productName, price);

	   // Maintain sorted order of products by price
	   productSortedByPrice.putIfAbsent(price, new ArrayList<>());
	   productSortedByPrice.get(price).add(productName);
    }

    // Displays products in the order they were added
    public void displayProductsInOrder() {
	   System.out.println("\nProducts in Order (LinkedHashMap):");
	   for (Map.Entry<String, Integer> entry : productOrderMap.entrySet()) {
		  System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
	   }
    }

    // Displays products sorted by their price
    public void displayProductsSortedByPrice() {
	   System.out.println("\nProducts Sorted by Price (TreeMap):");
	   for (Map.Entry<Integer, List<String>> entry : productSortedByPrice.entrySet()) {
		  for (String product : entry.getValue()) {
			 System.out.println("Product: " + product + ", Price: " + entry.getKey());
		  }
	   }
    }

    // Displays the total price of all products
    public void displayTotalPrice() {
	   int totalPrice = productPriceMap.values().stream().mapToInt(Integer::intValue).sum();
	   System.out.println("\nTotal Price: " + totalPrice);
    }

    // Getter method for total price (for testing)
    public int getTotalPrice() {
	   return productPriceMap.values().stream().mapToInt(Integer::intValue).sum();
    }

    // Getter method for product order (for testing)
    public List<String> getProductsInOrder() {
	   return new ArrayList<>(productOrderMap.keySet());
    }

    //  Getter method for products sorted by price (for testing)
    public Map<String, Integer> getProductsSortedByPrice() {
	   Map<String, Integer> sortedProducts = new LinkedHashMap<>();
	   for (Map.Entry<Integer, List<String>> entry : productSortedByPrice.entrySet()) {
		  for (String product : entry.getValue()) {
			 sortedProducts.put(product, entry.getKey());
		  }
	   }
	   return sortedProducts;
    }
}
