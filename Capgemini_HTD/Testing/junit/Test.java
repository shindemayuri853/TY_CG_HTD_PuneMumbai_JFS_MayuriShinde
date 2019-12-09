package com.capgemini.junit;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Divya",75.2,"F");
		Student s2 = new Student("Mayuri", 77.2,"F");
		School sc = new School();
		
		//sc.registerStudent(null);
		
		Student regStu = sc.registerStudent(s1);
		Student regStu2 = sc.registerStudent(s2);
		
		System.out.println("Student Id :"+regStu.getId());
		System.out.println("Student Name :"+regStu.getName());
		System.out.println(".................................");
		
		System.out.println("Student Id :"+regStu2.getId());
		System.out.println("Student Name :"+regStu2.getName());
		System.out.println(".................................");
	}

}
