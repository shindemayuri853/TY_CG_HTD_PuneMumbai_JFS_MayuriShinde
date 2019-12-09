package com.capgemini.springcore.beans;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean {
	private String message;

	//Getters and Setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Destroy Phase...");	
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Init Phase...");	
	}

	

}// End of class
