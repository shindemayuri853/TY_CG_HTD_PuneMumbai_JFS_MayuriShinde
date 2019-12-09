package com.capgemini.Subject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.dto.Subject;

public class ReferenceA {

	public static void main(String[] args) {
		Subject subject = new Subject();
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Subject data= entityManager.getReference(Subject.class, 10);
		System.out.println(data.getSid());
		System.out.println(data.getSname());
		System.out.println(data.getLevel());


	}

}
