package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryRunner {

    public static void fetchUsers() {

        String sql = "SELECT id, name FROM users";

        try (
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
