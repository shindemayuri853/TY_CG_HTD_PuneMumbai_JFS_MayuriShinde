package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
public class InsertDemo {

	public static void main(String[] args) {
		Movie movie= new Movie();

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager =null;
		EntityTransaction transaction = null;
		movie.setId(8);
		movie.setName("Anaari");
		movie.setRating("Good");
		try {
		entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
		System.out.println("Record Saved");
		transaction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
