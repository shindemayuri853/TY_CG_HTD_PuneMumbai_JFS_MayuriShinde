package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class DeleteDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction=null;
		try {EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		Movie data = entityManager.find(Movie.class,4);
		System.out.println("Record Deleted");
		transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();

	}

}
