package com.capgemini.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {

	@GetMapping("/cookiePage")
	public String displayCookiePage() {
		
		return "cookiePage";
	}// end of displayCookiePage()
	
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelMap) { 
		Cookie myCookie=  new Cookie("name","Mayuri");
		resp.addCookie(myCookie);
		
		modelMap.addAttribute("msg", "Cookie Created Successfully...");
		
		return "cookiePage";
	}// end of create cookie;
	
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="name") String name, ModelMap modelMap) {
		modelMap.addAttribute("msg", "Cookie value is" +name);
		
		return "cookiePage";
	}// end of readCookie()
	
}// end of class

