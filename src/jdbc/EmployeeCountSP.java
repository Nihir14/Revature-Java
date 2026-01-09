package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class EmployeeCountSP {

    public static void main(String[] args) {

        String sql = "{CALL getEmployeeCount(?)}";

        try (
            Connection con = DBUtilSP.getConnection();
            CallableStatement cs = con.prepareCall(sql)
        ) {

            cs.registerOutParameter(1, Types.INTEGER); // OUT parameter
            cs.execute();

            int totalEmployees = cs.getInt(1);
            System.out.println("Total Employees: " + totalEmployees);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
