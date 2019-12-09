package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.PencilBox;

public class OneToMany {

	public static void main(String[] args) {
		Pencil pencil2= new Pencil();
		pencil2.setPid(1);
		pencil2.setColor("Blue");
		
		PencilBox box = new PencilBox();
		box.setBoxid(1001);
		box.setName("Doms");
		
		pencil2.setPencilBox(box);
		
		EntityManager entityManager=null;
		EntityTransaction transaction = null;
		
		try{EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(pencil2);
		entityManager.persist(box);
		System.out.println("Record Saved");
		transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}


	}

}
