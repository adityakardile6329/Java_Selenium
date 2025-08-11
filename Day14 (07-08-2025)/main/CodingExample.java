package main;

public class CodingExample {

	// Method
	public String reverseTable(int num) {
		System.out.println("Reverse Table Solution:");
		String result = "";
		for (int i = 0; i < 10; i++) {
			int multiplier = 10 - i;
			int product = num * multiplier;
			result += product + " ";
		}
		return result.trim();
	}

	// Method
	public String getAllAlphabets() {
		System.out.println("All Alphabets Solution:");
		String result = "";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			result += ch + " ";
		}
		return result.trim();
	}

	// Method
	public String getAsciiValues() {
		System.out.println("All ASCII Solution:");
		String result = "";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			result += (int) ch + " ";
		}
		return result.trim();
	}

	// Method
	public int findFactorial(int num) {
		System.out.println("Factorial of a number Solution:");
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// Method
	public String countNumbers(int[] nums) {
		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int num : nums) {
			if (num > 0) {
				positive++;
			} else if (num < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		return "Positive: " + positive + ", Negative: " + negative + ", Zero: " + zero;
	}

	// Method
	public String findMinMax(int[] nums) {
		if (nums == null || nums.length == 0) {
			return "Array is empty ";
		}

		int min = nums[0];
		int max = nums[0];

		for (int num : nums) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		return "Smallest: " + min + ", Largest: " + max;
	}

	// MEthod
	public String divisibleByNine() {
		int sum = 0;
		int count = 0;

		for (int i = 100; i <= 200; i++) {
			if (i % 9 == 0) {
				count++;
				sum += i;
			}
		}

		return count + " " + sum;
	}

	// Method
	public String displayOnes(int num) {
		return "1's Complement of " + num + " is: " + ~num;
	}

	// Method
	public String displaytwos(int num) {
		return "2's Complement of " + num + " is: " + (~num + 1);
	}

	// Method
	public String fibonacciSeries(int num) {
		String result = "";
		int a = 0, b = 1;

		for (int i = 1; i <= num; i++) {
			result += a + b;
			int temp = a + b;
			a = b;
			b = temp;
		}
		return "FibonacciSeries: " + result.trim();
	}
}
