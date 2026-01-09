package utilityclasses;

import java.sql.Connection;

public class TestDB {

    public static void main(String[] args) {

        try (Connection con = DBUtil.getConnection()) {

            System.out.println("Connected using Utility Class");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
