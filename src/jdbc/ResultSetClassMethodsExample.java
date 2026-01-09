package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetClassMethodsExample {

    public static void main(String[] args) {

        String sql = "SELECT emp_id, emp_name, department, salary FROM employees";

        try (
            Connection con = DBUtilSP.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            ResultSet rs = ps.executeQuery()
        ) {

            // ===== Cursor Position Methods =====

            System.out.println("isBeforeFirst(): " + rs.isBeforeFirst());

            if (rs.next()) {
                System.out.println("next(): " + rs.getInt("emp_id"));
            }

            System.out.println("getRow(): " + rs.getRow());

            if (rs.first()) {
                System.out.println("first(): " + rs.getString("emp_name"));
            }

            if (rs.last()) {
                System.out.println("last(): " + rs.getString("emp_name"));
            }

            System.out.println("isAfterLast(): " + rs.isAfterLast());

            rs.beforeFirst();
            System.out.println("Cursor moved to beforeFirst()");

            rs.absolute(3);
            System.out.println("absolute(3): " + rs.getString("emp_name"));

            rs.relative(-1);
            System.out.println("relative(-1): " + rs.getString("emp_name"));

            // ===== Data Getter Methods =====
            System.out.println(
                    rs.getInt("emp_id") + " | " +
                    rs.getString("emp_name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getDouble("salary")
            );

            // ===== NULL check =====
            rs.getString("department");
            System.out.println("wasNull(): " + rs.wasNull());

            // ===== Metadata Methods =====
            ResultSetMetaData meta = rs.getMetaData();
            System.out.println("\nColumn Count: " + meta.getColumnCount());

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.println(
                        "Column " + i + ": " +
                        meta.getColumnName(i) + " (" +
                        meta.getColumnTypeName(i) + ")"
                );
            }

            // ===== Iteration =====
            rs.beforeFirst();
            System.out.println("\nAll Rows:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3) + " | " +
                        rs.getDouble(4)
                );
            }

            // ===== Close Check =====
            System.out.println("isClosed(): " + rs.isClosed());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
