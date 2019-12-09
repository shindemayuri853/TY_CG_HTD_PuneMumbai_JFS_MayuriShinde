package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.beans.EmployeeBean;
import com.capgemini.springcore.annotations.config.DepartmentConfig;
import com.capgemini.springcore.annotations.config.EmployeeConfig;
import com.capgemini.springcore.beans.DepartmentBean;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class,DepartmentConfig.class);
		((AbstractApplicationContext)context).registerShutdownHook(); // to destroy objects externally
		
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		System.out.println("Employee Id : "+employeeBean.getEmpId());
		System.out.println("Employee Name : "+employeeBean.getEmpName());
		System.out.println("Department Info....");
		System.out.println("Department Id:" +employeeBean.getDeptBean().getDeptId());
		System.out.println("Department name is :" +employeeBean.getDeptBean().getDeptName());
		
		//((AbstractApplicationContext)context).close(); //To destroy objects
	}// end of main method

}// end of class
