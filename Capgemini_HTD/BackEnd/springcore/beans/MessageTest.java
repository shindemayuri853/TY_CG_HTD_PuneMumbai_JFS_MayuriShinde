package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 ((AbstractApplicationContext)context).registerShutdownHook(); //for destroying object
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");
		System.out.println(messageBean.getMessage());
		
		// ((AbstractApplicationContext)context).close(); // Explicitly closing/destroying the object
		
	} //End of main()

}// end of class
