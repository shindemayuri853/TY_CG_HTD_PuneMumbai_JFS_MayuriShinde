package com.capgemini.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.bean.EmpInfoBean;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/empLoginForm")
	public String displayEmplBody() {
		return "empLoginForm";
	}// end of displayEmployee

	@PostMapping("/empLogin")
	public String empLogin(int empId, String password, ModelMap modelMap, HttpServletRequest req) {
		EmpInfoBean employeeInfoBean = service.authenticate(empId, password);
		if (employeeInfoBean != null) {
			//Valid Credential
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			
			return "empHomePage";
		} else {
			//Invalid Credential
			modelMap.addAttribute("msg", "Invalid Credentials...");
			return "empLoginForm";
		}
	}// end of empLogin()
	
	@GetMapping("/addEmployeeForm")
	public String displayAddEmpForm(HttpSession session, ModelMap modelMap ) {
		if(session.isNew()) {   //will return boolean value whether session is new or not
			modelMap.addAttribute("msg","Please Login First...");
			return "empLoginForm";
		}else {
			return "addEmployeeForm";
		}
		
	}// end of displayAddForm()
	
	@PostMapping("/addEmployee")
	public String addEmployee(EmpInfoBean employeeInfoBean, HttpSession session,
			ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please LoginFirst!!");
			return "empLoginForm";
		}else {
			if(service.addEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee Added Successfully");
			}else {
				modelMap.addAttribute("msg", "Unable to add Employee");
			}
			return "addEmployeeForm";
		}
	}// end of addEmployee()
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logged Out Successfully");
	return "empLoginForm";
	}// end of logout
	
	@GetMapping("/updateEmployeeForm")
	public String displayUpdateEmpFrom(HttpSession session, ModelMap modelMap) {
		if(session.isNew()){
			// Invalid Session
			modelMap.addAttribute("msg","Please Login First");
			return "empLoginForm";
		}else {
			//valid Session
			
			return "updateEmployeeForm";
		}
	}// end of displayUpdate
	
	@PostMapping("/updateEmployee")
		public String updateEmployee(HttpSession session, EmpInfoBean employeeInfoBean, ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		}else {
			// valid session
			if(service.updateEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Updated Successfully");
			}else {
				modelMap.addAttribute("msg", "Unable To Update...");
			}return "updateEmployeeForm";
		}
	}// end of updateEmployee
	
	@GetMapping("/searchEmployee")
	public String searchEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			EmpInfoBean employeeInfoBean = service.getEmployee(empId);
			if (employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!!!");
			}
			
			return "searchEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/deleteEmployeeForm")
	public String displayDeleteEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "deleteEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			if(service.deleteEmployee(empId)) {
				modelMap.addAttribute("msg", "Employee Deleted Successfully!");
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!");
			}
			
			return "deleteEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/seeAllEmployees")
	public String getAllEmployees(HttpSession session, ModelMap modelMap) {
		
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else { 
			// valid session
			List<EmpInfoBean> employeesList = service.getAllEmployees();
			modelMap.addAttribute("employeesList", employeesList);
			
			return "displayAllEmployees";
		}
	}// End of getAllEmployees()
	
	@GetMapping("/home")
	public String displayEmpHomePage(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "empHomePage";
		}
	}// End of displayEmpHomePage()


}// end of controller class
