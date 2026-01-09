package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class EmployeesByDepartmentSP {

    public static void main(String[] args) {

        String sql = "{CALL getEmployeesByDepartment(?)}";

        try (
            Connection con = DBUtilSP.getConnection();
            CallableStatement cs = con.prepareCall(sql)
        ) {

            cs.setString(1, "IT");   // IN parameter

            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(
                            rs.getString("emp_name") + " | " +
                            rs.getDouble("salary")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
