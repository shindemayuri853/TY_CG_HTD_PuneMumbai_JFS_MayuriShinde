package com.capgemini.springcore.beans;

public class MessageBean2 {
	private String message;
	//constructor
	public MessageBean2() {
		System.out.println("Inside Constructor");
	}
	
	//Getters and setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Its init Phase....");
	}
	public void destroy() {
		System.out.println("Its destroy Phase...");
	}
	
} //End of class
