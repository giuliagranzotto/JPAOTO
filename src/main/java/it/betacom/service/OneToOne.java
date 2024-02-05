package it.betacom.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.betacom.entity.Istituto;
import it.betacom.entity.Presidente;

public class OneToOne {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPAOTO");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Istituto istituto = new Istituto();
		istituto.setName("Zucchi");
		
		entityManager.persist(istituto);
		
		Presidente presidente = new Presidente();
		presidente.setNome("Luigi");
		presidente.setCognome("Bianchi");
		presidente.setIstituto(istituto);
		
		entityManager.persist(presidente);
		
		
		Istituto istituto2 = new Istituto();
		istituto.setName("Marconi");
		
		entityManager.persist(istituto2);
		
		Presidente presidente2 = new Presidente();
		presidente2.setNome("Marco");
		presidente2.setCognome("Rossi");
		presidente2.setIstituto(istituto2);
		
		
		entityManager.persist(presidente);
		
		

		entityManager.getTransaction().commit();
		entityManager.close();
		emFactory.close();

	}

}
