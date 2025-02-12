package dynamiconlinemarketplacetest;

import com.dynamiconlinemarketplace.BookCategory;
import com.dynamiconlinemarketplace.ClothingCategory;
import com.dynamiconlinemarketplace.GadgetCategory;
import com.dynamiconlinemarketplace.Product;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class DynamicOnlineMarketPlaceTest {

    // Test case to check if the BookCategory is correctly handled
    @Test
    public void testOfBookCategory() {
	   // Creating book categories
	   BookCategory fictionCategory = new BookCategory("Books", "Fiction");
	   BookCategory eBookCategory = new BookCategory("E-book", "Fiction");

	   // Creating a product with the initial category
	   Product<BookCategory> book = new Product<>("The Lord of the Rings by J R R Tolkien", 20.0, fictionCategory);

	   // Adding categories to the product
	   book.addProduct(fictionCategory);
	   book.addProduct(eBookCategory);

	   // Expected categories for the product
	   List<String> categoriesList = List.of("Books", "E-book");

	   // Checking if the product categories match the expected list
	   Assertions.assertEquals(categoriesList, book.getProductList().stream().map(item -> item.categoryName).toList());
    }

    // Test case to check if the ClothingCategory is correctly handled
    @Test
    public void testOfClothingCategory() {
	   // Creating clothing categories
	   ClothingCategory casualWear = new ClothingCategory("Casual WearClothing", "Casual Wear");
	   ClothingCategory formalWear = new ClothingCategory("Formal WearClothing", "Formal Wear");

	   // Creating a product with the initial category
	   Product<ClothingCategory> tShirt = new Product<>("Graphic Shirt", 25.0, casualWear);

	   // Adding categories to the product
	   tShirt.addProduct(casualWear);
	   tShirt.addProduct(formalWear);

	   // Expected categories for the product
	   List<String> clothingList = List.of("Casual WearClothing", "Formal WearClothing");

	   // Checking if the product categories match the expected list
	   Assertions.assertEquals(clothingList, tShirt.getProductList().stream().map(item -> item.categoryName).toList());
    }

    // Test case to check if the GadgetCategory is correctly handled
    @Test
    public void testOfGadgetCategory() {
	   // Creating gadget categories
	   GadgetCategory smartDevices = new GadgetCategory("Mobile Gadgets", "Smart Devices");
	   GadgetCategory laptops = new GadgetCategory("Laptop Gadgets", "Laptops");

	   // Creating a product with the initial category
	   Product<GadgetCategory> smartwatch = new Product<>("Smartwatch", 1250.0, smartDevices);

	   // Adding categories to the product
	   smartwatch.addProduct(smartDevices);
	   smartwatch.addProduct(laptops);

	   // Expected categories for the product
	   List<String> gadgetList = List.of("Mobile Gadgets", "Laptop Gadgets");

	   // Checking if the product categories match the expected list
	   Assertions.assertEquals(gadgetList, smartwatch.getProductList().stream().map(item -> item.categoryName).toList());
    }
}
