package com.capgemini.dummy.controller;

import java.util.Scanner;

import com.capgemini.dummy.bean.UserBean;
import com.capgemini.dummy.dao.UserDAO;
import com.capgemini.dummy.dao.UserDAOImplementation;
import com.capgemini.factory.UserFactory;

public class MainMethod {

	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		UserBean user = new UserBean();
		System.out.println("Enter 1 to show all food items");
		System.out.println("Enter 2 to take Oder from Customers");
		System.out.println("Press 3 to operate on food items");
		System.out.println("Press 4 to total bill of the day");
		int userInput = s.nextInt();
		UserDAO dao = UserFactory.getInstance();
		switch(userInput){
		case 1 :
			GetAllInfo.getAllInfo1();	
			break;
		case 2 : GetOrder.order();
			break;
		case 3 :
		System.out.println("Press A to add food item");
		System.out.println("Press B to remove food item");
		System.out.println("Press C to modify food item");
		char input = s.next().charAt(0);
		switch(input) {
		case 'A' :
			dao.insertMenu();
			break;
		case 'B' : 
			dao.remove();
			break;
		case 'C':
			dao.modify();
			break;
		}
		break;
		
		default:
			break;
		}
	}
}
