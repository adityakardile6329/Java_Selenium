package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.CodingExample;

public class CodingExampleTest {

	CodingExample coding = new CodingExample();

	@Test
	public void testReverseTable() {
		String expected = "50 45 40 35 30 25 20 15 10 5";
		String actual = coding.reverseTable(5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAllAlphabets() {
		String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String actual = coding.getAllAlphabets();
		assertEquals(expected, actual);
	}
	
	@Test
    public void testGetAsciiValues() {
        String expected = "97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122";
        String actual = coding.getAsciiValues();
        assertEquals(expected,actual);
    }
	
	@Test
	    public void testFindFactorial() {
	        assertEquals(120, coding.findFactorial(5)); 
    }
	
	@Test
	public void testCountNumbers() {
	    int[] input = {1, -2, 0, 5, 0, -3, 7}; 
	    String expected = "Positive: 3, Negative: 2, Zero: 2";
	    String actual = coding.countNumbers(input);
	    assertEquals(expected, actual);
	}
	
	@Test
	public void testFindMinMax() {
	    int[] input = {5, 9, -3, 0, 12, -7, 6};
	    String expected = "Smallest: -7, Largest: 12";
	    String actual = coding.findMinMax(input);
	    assertEquals(expected, actual);
	}
	

    @Test
    public void testDivisibleBynine() {
        String expected = "11 1683";
        String actual = coding.divisibleByNine();
        assertEquals(expected, actual);
    }
	 
	 @Test
	 public void testOnescomplement() {
		 String expected = "1's Complement of 4 is: -5";
		 String actual = coding.displayOnes(4);
		 assertEquals(expected,actual);
	 }
	 
	 @Test
	 public void testTwoscomplement() {
		 String expected = "2's Complement of 4 is: -4";
		 String actual = coding.displaytwos(4);
		 assertEquals(expected,actual);
	 }
	 
	 @Test
	 public void testFibonacci() {
		 String expected = "FibonacciSeries: 1235";
		 String actual = coding.fibonacciSeries(4);
		 assertEquals(expected,actual);
		 
	 }
}