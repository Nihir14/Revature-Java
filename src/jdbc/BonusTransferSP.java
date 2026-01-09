package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

public class BonusTransferSP {

    public static void main(String[] args) {

        String sql = "{CALL transferBonus(?, ?)}";

        try (
            Connection con = DBUtilSP.getConnection();
            CallableStatement cs = con.prepareCall(sql)
        ) {

            cs.setInt(1, 2);        // empId
            cs.setDouble(2, 3000); // bonus

            cs.execute();

            System.out.println("Bonus transferred successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
