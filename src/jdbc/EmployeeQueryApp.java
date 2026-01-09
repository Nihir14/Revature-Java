package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeQueryApp {

    public static void main(String[] args) {

        String sql = "SELECT id, name, salary FROM employee";

        try (
            Connection con = DBUtil.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
