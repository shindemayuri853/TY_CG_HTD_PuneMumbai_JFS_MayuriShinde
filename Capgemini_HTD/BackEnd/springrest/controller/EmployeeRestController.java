package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.bean.EmpInfoBean;
import com.capgemini.springrest.bean.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins="*",allowedHeaders = "*")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;

	@GetMapping(path="/getEmployee",
			produces = { MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	// @ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmpInfoBean bean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Found");
			response.setEmployeeInfoBean(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee Id" +empId+"Not Found");
		}
		return response;
	}// end of getEmployee()

	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })

	// produces = MediaType.APPLICATION_XML_VALUE)
	// @ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmpInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data is Added Successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add Data...");
		}
		return response;
	}// end of addEmployee()

	@DeleteMapping(path = "/deleteEmployee",
			// consumes = MediaType.APPLICATION_XML_VALUE,
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public EmployeeResponse deleteEmployee(int empId) {
		boolean isDeleted = service.deleteEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if (isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data is Deleted Successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Delete Data...");
		}
		return response;
	}// end of deleteEmployee()

	@PostMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmpInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if (isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data is Updated Successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Update Data...");
		}
		return response;
	}// end of update

	@GetMapping(path="/getAll",
			consumes = { MediaType.APPLICATION_XML_VALUE ,MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getAllEmployee() {
		List<EmpInfoBean> list = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if(list !=null && list.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("");
			response.setList(list);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("");
		}return response;
	}// end of getAllEmployee()
}// end of controller
