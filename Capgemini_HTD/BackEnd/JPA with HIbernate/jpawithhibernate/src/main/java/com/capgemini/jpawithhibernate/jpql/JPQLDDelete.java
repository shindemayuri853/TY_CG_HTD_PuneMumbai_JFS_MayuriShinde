package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDDelete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "delete from Movie where id=:nm";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nm",4);
		int count = query.executeUpdate();
		transaction.commit();
		if(count!=0) {
			System.out.println("Data Deleted");
		}
		entityManager.close();
	}

}
