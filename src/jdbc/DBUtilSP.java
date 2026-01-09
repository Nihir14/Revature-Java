package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtilSP {

    private static final String URL =
            "jdbc:mysql://localhost:3306/ProcedureExample";
    private static final String USER = "root";
    private static final String PASSWORD = "Nami1224@@@@";

    private DBUtilSP() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
