package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	Connection con = null;

	public Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/Java_Selenium";
			String username = "root";
			String password = "Aditya";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}