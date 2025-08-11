package day7;

public class Swap {
	public void swap(int a, int b) {
		System.out.println("Before swapping: a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
