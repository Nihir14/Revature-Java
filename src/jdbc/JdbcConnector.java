package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcConnector {

    public static void testConnection() {

        try (Connection con = ConnectionProvider.getConnection()) {
            System.out.println("Database connection successful");
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}
