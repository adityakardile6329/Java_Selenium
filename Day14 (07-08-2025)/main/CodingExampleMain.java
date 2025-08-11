package main;

public class CodingExampleMain {

	public static void main(String[] args) {
		CodingExample ce = new CodingExample();
		
		System.out.println(ce.reverseTable(5));
		System.out.println(ce.getAllAlphabets());
		System.out.println(ce.getAsciiValues());
		System.out.println(ce.findFactorial(5));
		System.out.println(ce.countNumbers(new int[]{1, -2, 0, 5, 0, -3, 7}));
		System.out.println(ce.findMinMax(new int[]{4, 7, -5, 0, 25, -4, 86}));
		System.out.println(ce.divisibleByNine());
		System.out.println(ce.displayOnes(4));
		System.out.println(ce.displaytwos(4));
		System.out.println(ce.fibonacciSeries(4));
	

	}

}
