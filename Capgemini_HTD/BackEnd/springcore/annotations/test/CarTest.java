package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotations.beans.Car;
import com.capgemini.springcore.annotations.config.EngineConfig;

public class CarTest {

	public static void main(String[] args) {
		//Instantiate the container
		ApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
		// ApplicationContext context2 = new AnnotationConfigApplicationContext(EngineConfig.class);
		Car myCar = context.getBean("myCar" , Car.class);

		System.out.println("Model Name : "+myCar.getModelName());
		System.out.println("Model Number : "+myCar.getModelNo());
		System.out.println("Engine Details.....");
		System.out.println("CC : "+myCar.getEngine().getcc());
		System.out.println("Type : "+myCar.getEngine().getType());
		
	}//end of main

}// end of class