package com.jsp.package1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee e = em.find(Employee.class, 1);
		e.setAddress("melbourne");
		e.setName("australia");
		e.setSal(123450);
		em.merge(e);
		et.commit();

	}

}
