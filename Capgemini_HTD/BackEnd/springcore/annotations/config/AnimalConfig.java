package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.interfaces.Dog;
import com.capgemini.springcore.interfaces.Panda;

@Configuration
public class AnimalConfig {

	@Bean
	public Dog getDog() {
		return new Dog();
	}// end of getDog()
	
	@Bean
	@Primary
	public Panda getPanda() {
		return new Panda();
	}
}// end of class
