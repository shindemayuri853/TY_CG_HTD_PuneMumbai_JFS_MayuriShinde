package com.capgemini.Subject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.dto.Subject;

public class ReattachA {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		Subject data = entityManager.find(Subject.class,10);
		System.out.println(data.getSid());
		System.out.println(entityManager.contains(data));
		entityManager.detach(data);
		System.out.println("After Detach :"+entityManager.contains(data));
		Subject data1 = entityManager.merge(data);
		System.out.println("After Merge :"+entityManager.contains(data1));
		

	}

}
