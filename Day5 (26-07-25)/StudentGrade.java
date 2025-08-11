package day6;

import java.util.Scanner;

class InvalidGrade extends Exception {
	public InvalidGrade(String message) {
		super(message);
	}
}

public class StudentGrade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of students: ");

		int numOfStudents = sc.nextInt();

		try {

			for (int i = 1; i <= numOfStudents; i++) {

				System.out.print("Enter name : ");

				String name = sc.next();

				System.out.print("Enter the grade (0 - 100) : ");

				int grade = sc.nextInt();

				try {

					if (grade < 0 || grade > 100) {

						throw new InvalidGrade("Grade not in the range!");

					} else {

						System.out.println("Name of the student : " + name + " , Grade : " + grade);

					}

				} catch (InvalidGrade e) {

					System.out.println("Exception caught for " + name + " : " + e.getMessage());

				}

			}

		} finally {

			sc.close();

			System.out.println("Finally executed");

		}

	}

}
