package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator cal = null;

	@BeforeEach
	public void createObject() {
		cal = new Calculator();
	}

	@Test
	public void testAdd() {
		int i = cal.add(5, 6);
		assertEquals(11, i);
	}// end of testAdd()

	@Test
	public void testAddNegative() {
		int i = cal.add(5, -6);
		assertEquals(-1, i);
	}// end of testAdd()

	@Test
	public void testSub() {
		int i = cal.sub(6, 5);
		assertEquals(1, i);
	}// end of testSubNegative()

	@Test
	public void testMul() {
		int i = cal.mul(5, 6);
		assertEquals(30, i);
	}// end of testMul()

	@Test
	public void testDiv() {
		double i = cal.div(10, 2);
		assertEquals(5, i);
	}// end of testDiv()

	@Test
	public void testDivZero() {
		/*
		 * double i =cal.div(10, 0); assertEquals(0, i);
		 */
		assertThrows(ArithmeticException.class, () -> cal.div(10, 0));
	}// end of testDiv()

	@Test
	public void testFact() {
		int i = cal.fact(5);
		assertEquals(120, i);
	}// end of testFact()

	@Test
	public void testFactZero() {
		int i = cal.fact(0);
		assertEquals(1, i);
	}// end of testFactZero()

	@Test
	public void testFactNegative() {
		int i = cal.fact(-5);
		assertEquals(1, i);
	}// end of testFactNegative()

}// end of test class
