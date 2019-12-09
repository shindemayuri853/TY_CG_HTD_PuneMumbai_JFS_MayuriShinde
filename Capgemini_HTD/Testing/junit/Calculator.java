package com.capgemini.junit;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}// end of add()

	public int sub(int a, int b) {
		return a - b;
	}// end of sub()

	public int mul(int a, int b) {
		return a * b;
	}// end of mul()

	public double div(int a, int b) {
		return a / b;
	}// end of div()
	
	public int fact(int a) {
		int c =1;
		for(int b=1;b<=a; b++) {
		c =b*c;
		}
		return c;
	}// end of fact()
}// end of class
