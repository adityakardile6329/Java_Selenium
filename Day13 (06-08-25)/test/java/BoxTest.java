package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Box;

public class BoxTest {
	Box box = new Box();

	@Test
	public void testCircle() {
		double delta = 0.0001;
		assertEquals(314.1592, box.areaOfCircle(10),delta); 
	}

	@Test
	public void testTriangle() {
		assertEquals(30.0, box.areaOfTriangle(12,5));
	}

	@Test
	public void testSquare() {
		assertEquals(100, box.areaOfSquare(10)); 
	}

	@Test
	public void testRectangle() {
		assertEquals(25, box.areaOfRectangle(5,5));
	}

	@Test
	public void testSimpleInterest() {
		assertEquals(200.0, box.simpleInterest(1000, 10, 2));
	}

	@Test
	public void testAmount() {
		assertEquals(1100.0, box.amount(1000, 10, 1));
	}

}
