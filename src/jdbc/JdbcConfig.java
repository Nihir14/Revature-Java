package jdbc;

public class JdbcConfig {

    public static final String URL =
            "jdbc:mysql://localhost:3306/your_database";

    public static final String USERNAME = "root";
    public static final String PASSWORD = "password";

    private JdbcConfig() {
        // Prevent object creation
    }
}
