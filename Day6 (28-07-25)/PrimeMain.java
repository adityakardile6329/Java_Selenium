package day7;

import java.util.Scanner;

public class PrimeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		PrimeNumber prime = new PrimeNumber();

		if (prime.isPrime(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		sc.close();

	}

}
