package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class EmployeeCountCallableApp {

    public static void main(String[] args) {

        String sql = "{CALL ProcedureExample.getEmployeeCount(?)}";

        try (
            Connection con = DBUtilSP.getConnection();
            CallableStatement cs = con.prepareCall(sql)
        ) {

            // Register OUT parameter
            cs.registerOutParameter(1, Types.INTEGER);

            // Execute stored procedure
            cs.execute();

            // Get OUT parameter value
            int count = cs.getInt(1);

            System.out.println("Total Employees: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
