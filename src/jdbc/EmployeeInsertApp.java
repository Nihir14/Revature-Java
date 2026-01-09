package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class EmployeeInsertApp {

    public static void main(String[] args) {

        String sql =
                "INSERT INTO employees " +
                "(emp_id, emp_name, dept_id, salary, join_date, manager_id) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, 107);
            ps.setString(2, "Amit");
            ps.setInt(3, 30);
            ps.setInt(4, 48000);
            ps.setDate(5, Date.valueOf("2023-05-12"));
            ps.setInt(6, 201);

            int rowsInserted = ps.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Employee inserted successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
