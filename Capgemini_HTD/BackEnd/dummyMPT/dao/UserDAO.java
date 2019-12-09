
package com.capgemini.dummy.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dummy.bean.UserBean;

public interface UserDAO {
public List<UserBean> getAllInfo();
public void insertMenu();
public void remove();
public void modify();
public ArrayList<UserBean> getorder(int i);

}
