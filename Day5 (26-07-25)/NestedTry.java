package day6;

public class NestedTry {

	public static void main(String[] args) {
		int[] num = { 200, 10 };
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");
				int res = num[0] / num[1];
				System.out.println("Result " + res);
			} catch (ArithmeticException e) {
				System.out.println("Inners try catch block exception");
			}
			int value = num[1];
			System.out.println("Value " + value);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("outer catch arary out of bounds");

		}

	}

}
