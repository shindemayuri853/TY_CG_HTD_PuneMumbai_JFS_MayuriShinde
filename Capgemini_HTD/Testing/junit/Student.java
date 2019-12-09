package com.capgemini.junit;

public class Student {

	public int id;
	public String name;
	public double percentage;
	public String gender;
	
	//default Constructor 
	public Student() {
	}
	
	public Student( String name, double d, String gender) {
		this.name = name;
		this.percentage = d;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}// end of class
