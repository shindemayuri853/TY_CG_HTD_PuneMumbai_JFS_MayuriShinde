package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class VW implements Engine {

	@Override
	public int getcc() {
		return 1800;
	}

	@Override
	public String getType() {
		return "VW : 4-Stroke Petrol";
	}

}// end of class
