package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest2 {

	public static void main(String[] args) {
		//Instantiate the container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 // ((AbstractApplicationContext)context).registerShutdownHook();
		MessageBean2 messageBean2 = context.getBean("messageBean2",MessageBean2.class);
		System.out.println("Message ="+ messageBean2.getMessage());
		
		MessageBean2 bean2 = context.getBean("messageBean2",MessageBean2.class);
		System.out.println("Message ="+ bean2.getMessage());
		
		((AbstractApplicationContext)context).close(); //Explicitly close the method
	}

}//End of class
