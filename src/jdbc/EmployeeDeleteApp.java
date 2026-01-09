package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDeleteApp {

    public static void main(String[] args) {

        String sql = "DELETE FROM employees WHERE emp_id = ?";

        try (
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            // Employee ID to delete
            ps.setInt(1, 107);

            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully");
            } else {
                System.out.println("Employee not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
