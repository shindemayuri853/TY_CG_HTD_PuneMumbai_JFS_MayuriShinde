package com.capgemini.springcore.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.capgemini.springcore.beans.DepartmentBean;

public class EmployeeBean {
	private int empId;
	private String empName;
	@Autowired(required = false)
	@Qualifier("Test")
	private DepartmentBean deptBean;
	
//getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

	@PostConstruct
	public void init() {
		System.out.println("Its Init Phase...");
	}// end of init

	@PreDestroy
	public void destroy() {
		System.out.println("Its Destroy Phase...");
	} // end of destroy

}
// end of class