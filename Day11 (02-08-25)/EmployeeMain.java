package jdbcassesment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InsertRecord insert = new InsertRecord();
		DeleteRecord delete = new DeleteRecord();
		UpdateRecord update = new UpdateRecord();
		DisplayRecords display = new DisplayRecords();

		int option;
		do {
			System.out.println("\n--------Employee Menu--------");
			System.out.println(" ");
			System.out.println("1. Insert a new Record");
			System.out.println("2. Delete a record");
			System.out.println("3. Update the record");
			System.out.println("4. Display all the records.");
			System.out.println("5. Exit");
			System.out.print("Enter your choice from (1-5): ");
			option = sc.nextInt();

			switch (option) {
			case 1:
				insert.insert();
				break;
			case 2:
				delete.delete();
				break;
			case 3:
				update.update();
				break;
			case 4:
				display.displayAll();
				break;
			case 5:
				System.out.println("Exiting the program");
				break;
			default:
				System.out.println("Invalid choice!");
			}
		} while (option != 5);

		sc.close();

	}

}
