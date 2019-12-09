package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("eating pedigree");

	}// end of eat

	@Override
	public void speak() {
		System.out.println(" Dog Bark");
	}
	// end of speak

	@Override
	public void walk() {
		System.out.println("Dog is running...");

	}// end of walk

}// End of class
