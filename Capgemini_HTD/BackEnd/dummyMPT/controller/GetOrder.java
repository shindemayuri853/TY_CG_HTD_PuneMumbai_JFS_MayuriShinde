package com.capgemini.dummy.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.dummy.bean.UserBean;
import com.capgemini.dummy.dao.UserDAO;
import com.capgemini.factory.UserFactory;

public class GetOrder {
public static void order() {
	System.out.println("Enter Item Code");
	UserDAO dao = UserFactory.getInstance();
	Scanner scr = new Scanner(System.in);
	ArrayList<UserBean> user = new ArrayList<UserBean>();
	double sum = 0;
		while (true) {
			int i = scr.nextInt();
			if (i == 0) {
				System.out.println("Thank You");
				System.exit(i);
			} else if (i > 0 && i < 6) {
				user = dao.getorder(i);
				for (UserBean b : user) {
					System.out.println(b);
					sum = sum + b.getMenuId();
				}
			} else {
				System.out.println("Something Went Wrong");
			}
			System.out.println("Total Bill :Rs." + sum);
		}

	}

}