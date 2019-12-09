package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class JPQLRetrieve {

	public static void main(String[] args) {
		Movie movie = new Movie();
		 
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql ="from Movie";
		Query query = entityManager.createQuery(jpql);
		List<Movie> list = query.getResultList();
		for(Movie m: list) {
			System.out.println("ID is :"+m.getId());
			System.out.println("Name is :"+m.getName());
			System.out.println("Ratind is :"+m.getRating());
		}

		entityManager.close();
	}

}
