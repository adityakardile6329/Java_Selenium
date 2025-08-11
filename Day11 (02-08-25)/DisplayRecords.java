package jdbcassesment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DisplayRecords {
	public void displayAll() {
		try {
			JDBCConnection jdbc =new JDBCConnection();
			Connection connection = jdbc.getConnection();

			String query = "SELECT * FROM employee1";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);

			System.out.println("ID  Name  Department  Salary");
			System.out.println("-----------------------------");
			System.out.println(" ");

			while (rs.next()) {
				System.out.println(rs.getInt("empId") + " " + rs.getString("empName") + "    " + rs.getString("empDep") + "     " + rs.getDouble("empsal"));
			}
		} catch (Exception e) {
			System.out.println("Display Error: " + e.getMessage());
		}
	}
}