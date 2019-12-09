package com.capgemini.springcore.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest2 {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
	EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class);
	
	System.out.println("Enter Your Id");
	int empId= s.nextInt();
	s.nextLine();
	System.out.println("Enter your name");
	String empName = s.nextLine();
	
	emp1.setEmpId(empId);
	emp1.setEmpName(empName);
	
	System.out.println("Emp1 Id :" +emp1.getEmpId());
	System.out.println("Emp1 Name :" +emp1.getEmpName());
	
	EmployeeBean emp2 = context.getBean("employee",EmployeeBean.class);
	
	System.out.println("Enter Your Id");
	int empId2= s.nextInt();
	s.nextLine();
	System.out.println("Enter your name");
	String empName2 = s.nextLine();
	
	emp2.setEmpId(empId2);
	emp2.setEmpName(empName2);
	
	System.out.println("Emp1 Id :" +emp1.getEmpId());
	System.out.println("Emp1 Name :" +emp1.getEmpName());
	System.out.println("Emp2 Id :" +emp2.getEmpId());
	System.out.println("Emp2 Name :" +emp2.getEmpName());
	
}//end of main
}//end of class
