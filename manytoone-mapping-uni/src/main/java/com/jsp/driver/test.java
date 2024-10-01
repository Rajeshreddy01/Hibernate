package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Account;
import com.jsp.entities.Person;

public class test {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(23);
		p.setLoc("maratahalli");
		p.setName("rajesh");
		
		Account a1= new Account();
		a1.setBankName("axis");
		a1.setAcNumber(12344567);
		a1.setPerson(p);
		
		Account a2= new Account();
		a2.setBankName("canara");
		a2.setAcNumber(12344467);
		a2.setPerson(p);
		
		Account a3= new Account();
		a3.setBankName("sbi");
		a3.setAcNumber(12344577);
		a3.setPerson(p);

		
		
		
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(p);
		et.commit();
		
		
	}

}
