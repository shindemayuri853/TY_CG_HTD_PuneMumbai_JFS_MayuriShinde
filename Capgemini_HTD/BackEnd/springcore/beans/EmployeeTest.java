package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
public static void main(String[] args) {
	//Instantiate the container
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeBean employeeBean =(EmployeeBean)context.getBean("employee");
	EmployeeBean emlEmployeeBean2 = context.getBean("employee2", EmployeeBean.class);
	
	System.out.println("Employee Id:" +employeeBean.getEmpId());
	System.out.println("Employee Name:" +employeeBean.getEmpName());
	System.out.println("Employee Id:" +emlEmployeeBean2.getEmpId());
	System.out.println("Employee Name:" +emlEmployeeBean2.getEmpName());
}// end of main
	
}// end of class
