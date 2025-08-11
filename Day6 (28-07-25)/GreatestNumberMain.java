package day7;

public class GreatestNumberMain {

	public static void main(String[] args) {
		int[] numbers = { 12, 45, 67, 89, 23, 78, 34, 90, 56, 11 };

		GreatestNumber finder = new GreatestNumber();

		int greatest = finder.findMax(numbers);

		System.out.println("The greatest number among the 10 numbers is: " + greatest);
	}

}
