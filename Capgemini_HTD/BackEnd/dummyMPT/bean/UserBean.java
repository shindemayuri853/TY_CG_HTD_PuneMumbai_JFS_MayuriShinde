package com.capgemini.dummy.bean;

public class UserBean {
	private int MenuId;
	private String MenuName;
	private double price;
	public int getMenuId() {
		return MenuId;
	}
	public void setMenuId(int menuId) {
		MenuId = menuId;
	}
	public String getMenuName() {
		return MenuName;
	}
	public void setMenuName(String menuName) {
		MenuName = menuName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "UserBean [MenuId=" + MenuId + ", MenuName=" + MenuName + ", price=" + price + "]";
	}
	
	

}
