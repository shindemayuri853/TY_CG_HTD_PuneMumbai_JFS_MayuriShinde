package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Person;
import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class OneToOneTest {
	public static void main(String[] args) {
		
		Person person= new Person();
		person.setPid(4);
		person.setPname("Pranjali");
		
		VoterCard voter = new VoterCard();
		voter.setVid(1004);
		voter.setaddress("Mankhurd");
		
		person.setVoterCard(voter);
		
		EntityManager entityManager=null;
		EntityTransaction transaction = null;
		
		try{EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		
		VoterCard card = entityManager.find(VoterCard.class, 1002);

		card.getVid();
		card.getaddress();
		card.getPerson().getPid();
		card.getPerson().getPid();
		System.out.println("Record Saved");
		transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

}
}
