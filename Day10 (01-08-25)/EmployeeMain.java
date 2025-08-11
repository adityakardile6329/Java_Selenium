package day12;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PersonalDetails personal = new PersonalDetails("Kunal", "Pune", "Male", 24);
		ProfessionalDetails professional = new ProfessionalDetails(154, "Development", "Senior Software Engineer", 2);
		SalaryDetails salary = new SalaryDetails(50000.0, 10000.0, 5000.0, 3000.0);
		LeaveDetails leave = new LeaveDetails(20, 10, 5, 2);
		ProjectDetails projects = new ProjectDetails("Online Job Portal", "Onine Library Management",
				"Vehicle Accident Detection System");

		int option;
		do {
			System.out.println("\n-------EMployee Menu----------");
			System.out.println("\n1. Display Employee Personal Details");
			System.out.println("2. Display Employee Professional Details");
			System.out.println("3. Display Employee Salary Details");
			System.out.println("4. Display Employee Earned Leaves and Casual Leaves");
			System.out.println("5. Display Employee Projects Undertaken");
			System.out.println("6. Exit from the Menu");
			System.out.print("\nEnter your choice between (1-6) that you want to view:");
			option = sc.nextInt();

			switch (option) {
			case 1:
				personal.display();
				break;
			case 2:
				professional.display();
				break;
			case 3:
				salary.display();
				break;
			case 4:
				leave.display();
				break;
			case 5:
				projects.display();
				break;
			case 6:
				System.out.println("\nExiting from the menu.");
				break;
			default:
				System.out.println("\nInvalid option. Please select a valid option between (1-6)");
			}
		} while (option != 6);

		sc.close();
	}

}
