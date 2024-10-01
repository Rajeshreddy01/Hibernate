package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Company;
import com.jsp.entities.GST;

public class Test {

	public static void main(String[] args) {
		Company c= new Company();
		c.setName("Amazon");	
		c.setAddress("Bangaluru");
		c.setNoOfEmployee(20998764);
		
		GST gst = new GST();
		gst.setNumber("2345");
		gst.setCost(20000);
		c.setGst(gst);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(c);
		em.persist(gst);
		et.commit();
	}
}
