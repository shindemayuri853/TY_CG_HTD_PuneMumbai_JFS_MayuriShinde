package com.capgemini.springcore.beans;

import java.util.Set;

public class Medicine {
private String name;
private String type;
private double price;
	/* private List<String> drugs; */
private Set<String> drugsSet;

//Getters and Setters

public String getName() {
	return name;
}
public Set<String> getDrugsSet() {
	return drugsSet;
}
public void setDrugsSet(Set<String> drugsSet) {
	this.drugsSet = drugsSet;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
	/*
	 * public List<String> getDrugs() { return drugs; } public void
	 * setDrugs(List<String> drugs) { this.drugs = drugs; }
	 */
}// end of class
