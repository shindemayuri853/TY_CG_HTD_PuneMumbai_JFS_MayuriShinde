package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.PencilBox;

public class ManyToOneMAin {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		PencilBox pencilBox = new PencilBox();
		pencilBox.setBoxid(1);
		pencilBox.setName("Camlin");
		
		Pencil pencil = new Pencil();
		pencil.setPid(10);
		pencil.setColor("Orange");
		pencil.setPencilBox(pencilBox);
		
		Pencil pencil1 = new Pencil();
		pencil.setPid(11);
		pencil.setColor("Black");
		pencil.setPencilBox(pencilBox);
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
		    entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
}
