package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.beans.EmployeeBean;
import com.capgemini.springcore.beans.DepartmentBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
	EmployeeBean employeeBean = new EmployeeBean();
	employeeBean.setEmpId(101);
	employeeBean.setEmpName("Deepak");
	
	return employeeBean;
	}//end of getEmployeeBean()
	
	}// end of class
