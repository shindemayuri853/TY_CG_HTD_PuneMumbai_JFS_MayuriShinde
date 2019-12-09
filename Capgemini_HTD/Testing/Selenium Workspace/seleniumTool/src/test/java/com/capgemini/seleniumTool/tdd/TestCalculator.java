package com.capgemini.seleniumTool.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
	Calculator cal = new Calculator();

	@Test
	public void addTest() {
		int a = 10;
		int b = 20;
		int expected = 30;
		int actual = cal.add(a, b);
		Assert.assertEquals(expected, actual);
	}// end of addTest()

	@Test
	public void subTest() {
		int a = 10;
		int b = 20;
		int expected = -10;
		int actual = cal.sub(a, b);
		Assert.assertEquals(expected, actual);
	}// end of subTest()
}// end of class
