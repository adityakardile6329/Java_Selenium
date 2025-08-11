package main;

public class CodingEx_2Main {
	public static void main(String[] args) {
		CodingEx_2 ce = new CodingEx_2();

		System.out.println("Highest freq char is : " + ce.highestFreqChar("india"));
		System.out.println("============================================================");
		System.out.println("After replacing the vowel: " + ce.replaceVowel("car"));
		System.out.println("============================================================");
		System.out.println("Count of Letters,Digits and Special char is: " + ce.countChar("abc555@#$"));
		System.out.println("============================================================");
		System.out.println("Blank space removed from string: " + ce.removeSpaces("Range Rover"));
		System.out.println("============================================================");
		System.out.println("Concatenation of two strings: " + ce.concatenateStrings("Java","Selenium"));

	}
}