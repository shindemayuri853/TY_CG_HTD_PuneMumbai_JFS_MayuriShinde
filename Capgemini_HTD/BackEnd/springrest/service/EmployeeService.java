package com.capgemini.springrest.service;

import java.util.List;

import com.capgemini.springrest.bean.EmpInfoBean;

public interface EmployeeService {
	public  EmpInfoBean getEmployee(int empId);
	public EmpInfoBean authenticate(int empId,String password);
	public boolean addEmployee (EmpInfoBean employeeInfoBean);
	public boolean updateEmployee (EmpInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empId);
	public List<EmpInfoBean> getAllEmployees();

}// end of interface
