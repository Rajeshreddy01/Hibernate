package com.org.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Identity;
import com.jsp.entities.Person;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("rahul");
		p.setLoc("Bangaluru");
		p.setAge(23);
		
		Identity i = new Identity();
		i.setName("pan card");
		i.setNumber("cedpqwwr");
		
		p.setIdentity(i);
		i.setPerson(p);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p);
		em.persist(i);
        et.commit();

	}

}