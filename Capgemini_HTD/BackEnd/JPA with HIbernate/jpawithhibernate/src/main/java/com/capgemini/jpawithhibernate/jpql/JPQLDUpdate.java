package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "update Movie set name = :nm where id =:mid";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nm", "Raazi");
		query.setParameter("mid",4);
		int count = query.executeUpdate();
		transaction.commit();
		if(count!=0) {
			System.out.println("Data Updated");
		}
		entityManager.close();

	}

}
