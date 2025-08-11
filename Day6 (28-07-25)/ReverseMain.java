package day7;

public class ReverseMain {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println("Original array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		// Create object of ArrayReverser and reverse the array
		ArrayReverse reverse = new ArrayReverse();
		reverse.reverseArray(arr);

		System.out.println("Reversed array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
