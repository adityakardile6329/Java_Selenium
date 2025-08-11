package jdbcassesment;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {
	public void update() {
		try {
			JDBCConnection jdbc =new JDBCConnection();
			Connection connection = jdbc.getConnection();
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Employee ID to update: ");
			int empId = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter new Name: ");
			String empName = sc.nextLine();
			System.out.print("Enter new Department: ");
			String empDep = sc.nextLine();
			System.out.print("Enter new Salary: ");
			double empsal = sc.nextDouble();
			
			String query = "UPDATE employee1 SET empName = '" + empName + "', empDep = '" + empDep + "', empsal = "
					+ empsal + " WHERE empId = " + empId;
			
			Statement st = connection.createStatement();
			st.executeUpdate(query);
			System.out.println( "Employee record Updated successfully!");
		} catch (Exception e) {
			System.out.println("Update Error: " + e.getMessage());
		}
	}
}