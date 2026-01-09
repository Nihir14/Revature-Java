package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeSalaryUpdateApp {

    public static void main(String[] args) {

        String sql =
                "UPDATE employees SET salary = ? WHERE emp_id = ?";

        try (
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            // New salary
            ps.setInt(1, 60000);

            // Employee ID whose salary will be updated
            ps.setInt(2, 101);

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Salary updated successfully");
            } else {
                System.out.println("Employee not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
