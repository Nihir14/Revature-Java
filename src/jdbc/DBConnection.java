package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Nami1224@@@@";

    // Method to get connection
    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Load MySQL JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database connected successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }

        return connection;
    }
}
