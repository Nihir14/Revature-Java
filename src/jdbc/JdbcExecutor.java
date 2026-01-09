package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExecutor {

    public static int executeUpdate(String sql, Object... params) {

        int rowsAffected = 0;

        try (
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }

            rowsAffected = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowsAffected;
    }
}
