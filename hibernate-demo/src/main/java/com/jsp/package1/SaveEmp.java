package com.jsp.package1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmp {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("t-chala");
		e.setId(2);
		e.setAddress("wakandha");
		e.setSal(15000);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("success");
	}

}
