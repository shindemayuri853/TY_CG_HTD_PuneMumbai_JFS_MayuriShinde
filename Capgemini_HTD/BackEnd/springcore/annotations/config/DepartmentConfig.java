package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {
	@Bean (name="Dev")
	public DepartmentBean getDevelopmentDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(301);
		bean.setDeptName("Developer");
		
		return bean;
	}// end of getDepartmentBean()
	
	@Bean(name="Test")
	public DepartmentBean getTestingDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(302);
		bean.setDeptName("Testing");
		
		return bean;
	}// end of getTestingDept()
	
	@Bean(name="Hr")
	// @Primary
	public DepartmentBean getHrDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(303);
		bean.setDeptName("HR");
		
		return bean;
	}// end of getHrDept()

}// end of class
