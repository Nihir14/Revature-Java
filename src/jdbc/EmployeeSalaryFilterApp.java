package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeSalaryFilterApp {

    public static void main(String[] args) {

        String sql =
                "SELECT emp_id, emp_name, dept_id, salary, join_date, manager_id " +
                        "FROM employees WHERE salary > ?";

        try (
                Connection con = DBUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            // Set salary condition
            ps.setInt(1, 30000);

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    System.out.println(
                            rs.getInt("emp_id") + " | " +
                                    rs.getString("emp_name") + " | " +
                                    rs.getInt("dept_id") + " | " +
                                    rs.getInt("salary") + " | " +
                                    rs.getDate("join_date") + " | " +
                                    rs.getInt("manager_id")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
