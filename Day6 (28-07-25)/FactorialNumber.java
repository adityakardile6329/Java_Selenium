package day7;

public class FactorialNumber {
	public int calculateFactorial(int num) {
		int result = 1;

		for (int i = 1; i <= num; i++) {
			result = result * i; // Multiply result with i
		}

		return result;
	}

}
