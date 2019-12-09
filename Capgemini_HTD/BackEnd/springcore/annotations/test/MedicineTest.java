package com.capgemini.springcore.annotations.test;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Medicine;

public class MedicineTest {

	public static void main(String[] args) {
		// Instanciate 
		ApplicationContext context = new ClassPathXmlApplicationContext("medicalConfig.xml");
		Medicine medicineBean = context.getBean("medicine", Medicine.class);
		
		System.out.println("Medicine Name  " +medicineBean.getName());
		System.out.println("Medicine Type  " +medicineBean.getType());
		System.out.println("Medicine Price  " +medicineBean.getPrice());
	//	System.out.println("Medicine Contains  "+ medicineBean.getDrugs());
		System.out.println("Drugs Contains "+medicineBean.getDrugsSet());

	}// end of main

}// end of class
