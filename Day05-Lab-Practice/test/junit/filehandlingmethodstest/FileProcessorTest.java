package junit.filehandlingmethodstest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.filehandlingmethods.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.*;

public class FileProcessorTest {

    private final FileProcessor fileProcessor = new FileProcessor();
    private final String testFilename = "ankitfile.txt";

    @Test
    void testWriteToFile() throws IOException {
        // Creating a variable and store the content
        String content = "Hello, I am Ankit Rajput this is JUnit! testing";

        // writing content in file
        fileProcessor.writeToFile(testFilename, content);

        // Checking if the file was created successfully.
        File file = new File(testFilename);
        assertTrue(file.exists());
    }

    @Test
    void testReadFromFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(testFilename, content);

        // Reading the file and ensuring the content matches.
        String readContent = fileProcessor.readFromFile(testFilename);
        assertEquals(content, readContent);
    }

    @Test
    void testReadFromNonExistentFile() {
        // Attempting to read from a non-existent file should throw an IOException.
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("notexistpath.txt"));
    }

    @AfterEach
    void cleanUp() {
        // Cleaning up the test file after each test.
        new File(testFilename).delete();
    }
}
