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
		List<Student> s = new ArrayList<Student>();
		
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
		
		
		
		Student ss = new Student();
		ss.setName("rajesh");
		ss.setMarks(100);
		ss.setAddress("marathahalli");
		ss.setList(sub);
		
		Student ss1 = new Student();
		ss1.setName("kumar");
		ss1.setMarks(100);
		ss1.setAddress("btm");
		ss1.setList(sub);
		
		s.add(ss1);
		s.add(ss);
		
		s1.setList(s);
		s2.setList(s);
		s3.setList(s);
		
		ss.setList(sub);
		ss1.setList(sub);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(ss);
		em.persist(ss1);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);

		et.commit();
		

	}

}
