package day6;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.nextLine();

		System.out.println("Enter your age:");
		int age = sc.nextInt();

		System.out.println("Name is " + name +" "+ "Age is " + age);

	}
}