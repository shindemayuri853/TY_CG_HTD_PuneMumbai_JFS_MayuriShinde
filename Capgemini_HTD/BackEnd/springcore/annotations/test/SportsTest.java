package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Sports;

public class SportsTest {

	public static void main(String[] args) {
		// Instantiate the container
		ApplicationContext context = new ClassPathXmlApplicationContext("sportsConfig.xml");
		Sports sportsBean=context.getBean("sports",Sports.class);
		
		System.out.println("Sports Name "+sportsBean.getName());
		System.out.println("Total Players "+sportsBean.getTotalPlayers());
		System.out.println("Team Info "+sportsBean.getTeamInfo());

	}// end of main method

}// end of class
