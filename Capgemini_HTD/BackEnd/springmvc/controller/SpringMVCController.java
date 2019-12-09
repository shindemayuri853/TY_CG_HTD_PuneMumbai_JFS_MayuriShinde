package com.capgemini.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.bean.UserBean;

@Controller
public class SpringMVCController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView displayHelloUser() {
		ModelAndView modelAndView = new ModelAndView();
	//	modelAndView.setViewName("/WEB-INF/views/helloUser.jsp"); //if ViewResolver not configured
		modelAndView.setViewName("helloUser");
		return modelAndView;
	}// end of displayHelloUser()

	@RequestMapping(path = "/loginForm", method = RequestMethod.GET)
	public ModelAndView displayLoginForm() {
		ModelAndView modelAndView = new ModelAndView();
	 // modelAndView.setViewName("/WEB-INF/views/loginForm.jsp");  //if ViewResolver not configured
		modelAndView.setViewName("loginForm");

		return modelAndView;
	}// end of displayLoginForm

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, ModelAndView model) {
		String empIdVal = req.getParameter("empId");
		String passwordVal = req.getParameter("password");

		req.setAttribute("empId", empIdVal);
		req.setAttribute("password", passwordVal);
	//	model.setViewName("/WEB-INF/views/userDetails.jsp");  //if ViewResolver not configured
		model.setViewName("userDetails");
		
		return model;
	}// end of login

	@RequestMapping(path = "/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("empId") int empId, @RequestParam("password") String password,
			ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);

		return "/WEB-INF/views/userDetails.jsp";
	}// end of login 2
	
	@PostMapping("/login3")
	public String login3(int empId, String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);
		
		return "userDetails";
	}// end of login 3
	
	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		
		return "userDetails";
	} // end of login 4
}// end of class
