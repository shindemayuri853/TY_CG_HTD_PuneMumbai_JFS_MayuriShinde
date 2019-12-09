package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile1 = context.getBean("mobile", Mobile.class);
		
		System.out.println("Brand Name :" +mobile1.getBrandName());
		System.out.println("Model Name :" +mobile1.getModelName());
		System.out.println("Display Size : " +mobile1.getMobiledisplay().getDisplaySize());
		System.out.println("Resolution :" +mobile1.getMobiledisplay().getResolution());
		System.out.println("Price :"+mobile1.getPrice());
	} // end of main

}// end of class
