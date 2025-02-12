package smartwarehousemanagementtest;
import com.smartwarehousemanagementsystem.*;
import org.junit.Test;
import  org.junit.jupiter.api.Assertions;

import java.util.List;

public class SmartWareHouseManagementTest {
    @Test
    public void testElectronicsStorageList() {

	   //@TestCase 1 : Creating expected list of items for electronicsList
	   List<String> electronicsList = List.of("Laptop" , "Smartphone");

	   // Creating Generics and then Test Generics works as expected or not
	   Storage<Electronics> electronicsStorage = new Storage<>();

	   // Creating and adding electronic items to the electronics storage
	   electronicsStorage.addItem(new Electronics("Laptop", 4));
	   electronicsStorage.addItem(new Electronics("Smartphone", 2));

	   Assertions.assertEquals(
			 electronicsList,
			 electronicsStorage.getItems().stream().map(item -> item.name).toList()
	   );




    }


    @Test
    public void testGroceriesStorageList() {
	   //@TestCase 2 : Creating expected list of items for groceries
	   List<String> groceryList = List.of("Rice" , "Wheat");

	   Storage<Groceries> groceriesStorage = new Storage<>();

	   // Creating and adding grocery items to the groceries storage
	   groceriesStorage.addItem(new Groceries("Rice", "2025-05-10"));
	   groceriesStorage.addItem(new Groceries("Wheat", "2025-02-15"));


	   Assertions.assertEquals(
			 groceryList,
			 groceriesStorage.getItems().stream().map(item -> item.name).toList()
	   );
    }


    @Test
    public void testFurnitureStorageList() {

	   //@TestCase 3 : Creating expected list of items for furniture
	   List<String> furnitureList = List.of("Chair" , "Table");

	   // Creating Generics and then Test Generics works as expected or not
	   Storage<Furniture> furnitureStorage = new Storage<>();

	   // Creating and adding furniture items to the furniture storage
	   furnitureStorage.addItem(new Furniture("Chair", "Wood"));
	   furnitureStorage.addItem(new Furniture("Table", "Metal"));

	   Assertions.assertEquals(
			 furnitureList,
			 furnitureStorage.getItems().stream().map(item -> item.name).toList()
	   );




    }
}
