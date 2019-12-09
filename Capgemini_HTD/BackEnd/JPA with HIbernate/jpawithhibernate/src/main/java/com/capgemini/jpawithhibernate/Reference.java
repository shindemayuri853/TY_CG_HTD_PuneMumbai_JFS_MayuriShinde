package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reference {

	public static void main(String[] args) {
		Movie movie = new Movie();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie data = entityManager.getReference(Movie.class, 5);
		System.out.println("Id is :" +data.getId());
		System.out.println("Name is :" +data.getName());
		System.out.println("Rating is :" +data.getRating());
		System.out.println("***********************************");
		
		Movie data1 = entityManager.find(Movie.class, 2);
		System.out.println("Id is :" +data1.getId());
		System.out.println("Name is :" +data1.getName());
		System.out.println("Rating is :" +data1.getRating());

	}

}
