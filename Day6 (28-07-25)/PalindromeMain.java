package day7;

import java.util.Scanner;

public class PalindromeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to check if palindrome or not:");
		String text = sc.nextLine();

		PalindromeCheck palindromeobj = new PalindromeCheck();

		if (palindromeobj.isPalindrome(text)) {
			System.out.println("The text is a palindrome.");
		} else {
			System.out.println("The text is not a palindrome.");
		}

		sc.close(); // Close the scanner

	}

}
