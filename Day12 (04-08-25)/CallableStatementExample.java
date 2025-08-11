package preparedstatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementExample {
    static Connection con = null;

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/Java_Selenium";
            String username = "root";
            String password = "Aditya";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            //CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?)}");
            CallableStatement cstmt = con.prepareCall("{call insertData}");
            cstmt.execute();

            //cstmt.setInt(1, 1004);
           // cstmt.setString(2, "Tom");
           // cstmt.setInt(3, 40000);
           // cstmt.execute();

           // cstmt.setInt(1, 1005);
           // cstmt.setString(2, "Jerry");
           // cstmt.setInt(3, 50000);
           // cstmt.execute();

            //cstmt.setInt(1, 1006);
            //cstmt.setString(2, "Mario");
            //cstmt.setInt(3, 60000);
           // cstmt.execute();

            System.out.println("Rows inserted ....");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
    }
}