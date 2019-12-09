package com.capgemini.springcore.interfaces;

import com.capgemini.springcore.interfaces.Animal;

public class Pet {
	private String name;
	private Animal animal;

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}// End of class
