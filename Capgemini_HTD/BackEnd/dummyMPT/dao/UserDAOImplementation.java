package com.capgemini.dummy.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.dummy.bean.UserBean;

public class UserDAOImplementation implements UserDAO {
	Scanner sc = new Scanner(System.in);
	UserBean user;
	FileReader reader = null;
	Properties prop = null;

	public UserDAOImplementation() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("jdbc.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserBean> getAllInfo() {
		List<UserBean> list = new ArrayList<UserBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"));) {
			while (rs.next()) {
				user = new UserBean();
				user.setMenuId(rs.getInt("MenuId"));
				user.setMenuName(rs.getString("MenuName"));
				user.setPrice(rs.getDouble("Price"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void insertMenu() {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query1"));) {
			System.out.println("Enter MenuId :");
			pstmt.setInt(1, Integer.parseInt(sc.next()));
			System.out.println("Enter Menuname");
			pstmt.setString(2, sc.next());
			System.out.println("Enter Price");
			pstmt.setDouble(3, Double.parseDouble(sc.next()));

			int count = pstmt.executeUpdate();
			if (count > 0)
				System.out.println("Data Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void remove() {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"));) {
			System.out.println("Enter MenuId");
			pstmt.setInt(1, Integer.parseInt(sc.next()));
			int count = pstmt.executeUpdate();
			if (count > 0)
				System.out.println("Data Deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void modify() {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3"));) {
			System.out.println("Enter MenuName of data which u want to Update");
			pstmt.setString(1, sc.next());
			System.out.println("Enter New Price");
			pstmt.setInt(2, Integer.parseInt(sc.next()));

			int count = pstmt.executeUpdate();
			if (count > 0)
				System.out.println("Data Updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<UserBean> getorder(int i) {
		ArrayList<UserBean> list = new ArrayList<UserBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"));) {
			pstmt.setInt(1, i);
			int count = pstmt.executeUpdate();
			if(count>0) {
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}