package com.capgemini.springboot.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {
	private int statusCode;
	private String message;
	private String description;
	private EmpInfoBean employeeInfoBean;
	private List<EmpInfoBean> list;
//Getters and Setters

	public List<EmpInfoBean> getList() {
		return list;
	}

	public void setList(List<EmpInfoBean> list) {
		this.list = list;
	}

	public EmpInfoBean getEmployeeInfoBean() {
		return employeeInfoBean;
	}

	public void setEmployeeInfoBean(EmpInfoBean employeeInfoBean) {
		this.employeeInfoBean = employeeInfoBean;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}// end of class
