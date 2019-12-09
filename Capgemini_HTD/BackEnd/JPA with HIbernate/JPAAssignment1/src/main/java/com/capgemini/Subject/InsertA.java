package com.capgemini.Subject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.dto.Subject;

public class InsertA {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		subject.setSid(11);
		subject.setSname("SQL");
		subject.setLevel("Very Good");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(subject);
		System.out.println("Data Inserted");
		transaction.commit();
		
		

	}

}
