package com.capgemini.springcore.interfaces;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Bamboo");
	}// end of eat

	@Override
	public void speak() {
		System.out.println("Panda Squeaks");

	}// end of speak

	@Override
	public void walk() {
		System.out.println("Panda id Walking...");
	}// end of walk

}// end of class
