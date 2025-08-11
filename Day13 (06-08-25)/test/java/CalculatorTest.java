package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	Calculator calc = new Calculator();

	@Test
	public void testadd() {
		assertEquals(20, calc.add(10, 10));
	}

	@Test
	public void testsub() {
		assertEquals(20, calc.sub(30, 10));
	}

	@Test
	public void testmul() {
		assertEquals(20, calc.mul(10, 2));
	}

	@Test
	public void testdiv() {
		assertEquals(10, calc.div(100, 10));
	}

}
