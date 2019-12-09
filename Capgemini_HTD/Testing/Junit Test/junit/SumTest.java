package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testAdd() {
		Sum s = new Sum();
		int a = s.add(10, 5);
		assertEquals(15, a);
		
	}// end of testAdd()
	
	@Test
	public void testAdd3() {
		Sum s = new Sum();
		int i = s.add3(5,6,7);
		assertEquals(18, i);
	}// end of testAdd3()

}// end of test class
