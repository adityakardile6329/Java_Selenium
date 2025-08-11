package jdbcassesment;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {
	public void insert() {
		try {
			JDBCConnection jdbc =new JDBCConnection();
			Connection connection = jdbc.getConnection();
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Employee ID: ");
			int empId = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Employee Name: ");
			String empName = sc.nextLine();
			System.out.print("Enter Department: ");
			String empDep = sc.nextLine();
			System.out.print("Enter Salary: ");
			double empsal = sc.nextDouble();
			String query = "INSERT INTO employee1 VALUES(" + empId + ", '" + empName + "', '" + empDep + "', " + empsal + ")";
			Statement st = connection.createStatement();
			st.executeUpdate(query);

			System.out.println( "Employee record inserted successfully!");
		} catch (Exception e) {
			System.out.println("Insert Error: " + e.getMessage());
		}
	}
}