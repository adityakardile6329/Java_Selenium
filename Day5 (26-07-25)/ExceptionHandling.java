package day6;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num, den, result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numerator");
		num = sc.nextInt();

		System.out.print("ENter the denominator");
		den = sc.nextInt();

//		try {
//			int[] arr = new int[4];
//			arr[5] = 2;
		try {
			result = num / den;
			System.out.println("Result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide the numerator by zero");
			e.printStackTrace();
		}
		// } /*catch (ArrayIndexOutOfBoundsException ae) {
		// ae.printStackTrace();*/
		// }
		finally {
			System.out.println("Finally block is executed");
		}
	}
}