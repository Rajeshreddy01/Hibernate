package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Student;
import com.jsp.entities.Subject;

public class test {

	public static void main(String[] args) {
		
		List<Subject> sub = new ArrayList<Subject>();
		
		Subject s1  = new Subject();
		s1.setDuration(3);
		s1.setTrainerName("joyson");
		s1.setName("java");
		
		
		Subject s2  = new Subject();
		s2.setDuration(2);
		s2.setTrainerName("raveesh");
		s2.setName("strings");
		
		Subject s3 = new Subject();
		s3.setDuration(1);
		s3.setTrainerName("greeshma");
		s3.setName("sql");
		
		sub.add(s1);
		sub.add(s2);
		sub.add(s3);
		
		
		
		Student s = new Student();
		s.setName("rajesh");
		s.setMarks(100);
		s.setAddress("marathahalli");
		s.setList(sub);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(s);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);

		et.commit();
		

	}

}
