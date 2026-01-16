package testing;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectionTest {

    @Test
    void shouldEstablishDatabaseConnection() {

        try (Connection con = DBUtilSP.getConnection()) {

            assertNotNull(con, "Connection should not be null");
            assertTrue(con.isValid(5), "Connection should be valid");

            System.out.println("Database connection test passed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
