package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytomany.Course;
import com.capgemini.jpawithhibernate.manytomany.Student;

public class ManyToManyMain {

	public static void main(String[] args) {
		ArrayList<Course> al=new ArrayList<Course>();

		/*
		 * Course course=new Course(); course.setCid(1001);
		 * course.setCname("Hibernate"); al.add(course);
		 * 
		 * Course course1=new Course(); course1.setCid(1002); course1.setCname("html");
		 * al.add(course1);
		 * 
		 * 
		 * Student student = new Student(); student.setSid(1);
		 * student.setSname("Mayuri"); student.setCourse(al);
		 */

		EntityManagerFactory entityManagerFactory =null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		
		try {
			entityManagerFactory =Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(student);
			
			
			  Course course2= entityManager.find(Course.class,1001);
			  System.out.println(course2.getStudent().get(0).getSid());
			 
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		entityManager.close();

	}

}
