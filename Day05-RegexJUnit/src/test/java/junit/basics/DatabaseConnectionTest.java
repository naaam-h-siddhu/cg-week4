package junit.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    DatabaseConnection connection;

    @BeforeEach
    void setUp(){
        connection = new DatabaseConnection();
        connection.connect();
    }
    @Test
    void connect() {
        assertTrue(connection.isConnected());
    }

    @Test
    void disconnect() {
        connection.disconnect();
        assertFalse(connection.isConnected());
    }
    @AfterEach
    void tearDown(){
        connection.disconnect();
    }
}