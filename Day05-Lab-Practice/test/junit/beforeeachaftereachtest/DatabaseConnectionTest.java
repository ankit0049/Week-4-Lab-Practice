package junit.beforeeachaftereachtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.beforeeachandaftereach.DatabaseConnection;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {

    private DatabaseConnection databaseConnection;
    // This method runs before each test case.
    @BeforeEach
    void setUp() {

        // Ensuring a fresh database connection is created before each test.
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    // This method runs after each test case.
    @AfterEach
    void tearDown() {
        // Ensuring the database connection is properly closed after each test.
        databaseConnection.disconnect();
    }

    @Test
    void testDatabaseConnection() {

        // Ensuring the connection is active after setUp().
        assertTrue(databaseConnection.checkConnected());
    }

    @Test
    void testDatabaseConnectionLost(){
        // de-activate the connection
        databaseConnection.setConnected(false);
        // Checking weather connection is disconnect or not
        assertFalse(databaseConnection.checkConnected());
    }

}
