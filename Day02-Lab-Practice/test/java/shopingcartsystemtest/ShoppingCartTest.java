package shopingcartsystemtest;

import com.shoppingcartsystem.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void testAddProductAndOrder() {
        cart.addProduct("Kiwi", 180);
        cart.addProduct("Banana", 45);
        cart.addProduct("Orange", 40);

        List<String> expectedOrder = Arrays.asList("Kiwi", "Banana", "Orange");
        assertEquals(expectedOrder, cart.getProductsInOrder());
    }

    @Test
    void testProductsSortedByPrice() {
        cart.addProduct("Kiwi", 180);
        cart.addProduct("Banana", 45);
        cart.addProduct("Orange", 40);
        cart.addProduct("Apple", 250);
        cart.addProduct("Mango", 30);

        Map<String, Integer> expectedSorted = new LinkedHashMap<>();
        expectedSorted.put("Mango", 30);
        expectedSorted.put("Orange", 40);
        expectedSorted.put("Banana", 45);
        expectedSorted.put("Kiwi", 180);
        expectedSorted.put("Apple", 250);

        assertEquals(expectedSorted, cart.getProductsSortedByPrice());
    }

    @Test
    void testTotalPrice() {
        cart.addProduct("Kiwi", 180);
        cart.addProduct("Banana", 45);
        cart.addProduct("Orange", 40);
        cart.addProduct("Apple", 250);
        cart.addProduct("Mango", 30);

        assertEquals(545, cart.getTotalPrice());
    }
}
