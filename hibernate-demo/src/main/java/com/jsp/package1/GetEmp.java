package com.jsp.package1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetEmp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee employee = em.find(Employee.class, 4);
		if(employee!=null) {
			
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSal());
			System.out.println(employee.getAddress());
		}
		else {
			System.out.println("no data present");
		}
		et.commit();
	}

}
