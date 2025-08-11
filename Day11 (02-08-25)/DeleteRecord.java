package jdbcassesment;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
	public void delete() {
		try {
			JDBCConnection jdbc =new JDBCConnection();
			Connection connection = jdbc.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Employee ID to delete: ");
			int empId = sc.nextInt();

			String query = "DELETE FROM employee1 WHERE empId = " + empId;
			Statement st = connection.createStatement();
			st.executeUpdate(query);
			System.out.println( "Employee record Deleted successfully!");
			sc.nextLine();
		} catch (Exception e) {
			System.out.println("Delete Error: " + e.getMessage());
		}
	}
}
