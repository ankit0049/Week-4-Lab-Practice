package annoations.overridetest;

import com.annotations.override.Animal;
import com.annotations.override.Dog;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DogTest {
    @Test
   public void testDogMakeSound() {

        // Creating an instance of Dog and calling makeSound()
        Animal myDog = new Dog();

        // Expected output
        String expectedOutput = "Bark! Bark!\n";

        // Comparing expected and actual output
        assertTrue(expectedOutput.equals(myDog.makeSound()), "Dog's makeSound() should print 'Bark! Bark!'");
    }
}
