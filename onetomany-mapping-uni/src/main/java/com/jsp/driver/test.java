package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Account;
import com.jsp.entities.Person;

public class test {

	public static void main(String[] args) {
		List<Account>list=new ArrayList<Account>();
		
		Account a1= new Account();
		a1.setBankName("sbi");
		a1.setAddress("marathahalli");
		a1.setAcNumber(1234567);
		
		Account a2= new Account();
		a2.setBankName("canara");
		a2.setAddress("magestic");
		a2.setAcNumber(3456878);

		Account a3= new Account();
		a3.setBankName("axis");
		a3.setAddress("btm-layout");
		a3.setAcNumber(23456789);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Person p = new Person();
		p.setAccounts(list);
		p.setAge(34);
		p.setLoc("Bangalore");
		p.setName("virat-kohli");
		
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
