package com.capgemini.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeBeanTest {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		EmployeeBean employeeBean =context.getBean("employees", EmployeeBean.class);
		
		System.out.println("Emp Id is :" +employeeBean.getEmpId());
		System.out.println("Emp Name is :" +employeeBean.getEmpName());
		System.out.println("Dept Id is :" +employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept Name is :"+employeeBean.getDeptBean().getDeptName());
	}

} //End of class

