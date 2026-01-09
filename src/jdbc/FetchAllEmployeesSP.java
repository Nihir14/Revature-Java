package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class FetchAllEmployeesSP {

    public static void main(String[] args) {

        String sql = "{CALL getAllEmployees()}";

        try (
            Connection con = DBUtilSP.getConnection();
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery()
        ) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " | " +
                        rs.getString("emp_name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary") + " | " +
                        rs.getDate("hire_date")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
