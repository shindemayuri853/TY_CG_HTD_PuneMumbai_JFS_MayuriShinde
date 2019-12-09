package com.capgemini.dummy.controller;

import java.util.List;

import com.capgemini.dummy.bean.UserBean;
import com.capgemini.dummy.dao.UserDAO;
import com.capgemini.factory.UserFactory;


public class GetAllInfo {
 public static void getAllInfo1() {
	 UserDAO dao = UserFactory.getInstance();
	 List<UserBean> list = dao.getAllInfo();
	 if(list!= null) {
		 for(UserBean user : list) {
			 System.out.println(user);
		 }
	 }else 
			 System.out.println("Something Went Wrong");
 }
 
}
