package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.enitities.Teacher;

public class TeacherDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
	EntityManager em = emf.createEntityManager();
	
	public void saveTeacher(Teacher teacher) {
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(teacher);
		et.commit();
	}
	public Teacher getTeacherById(int id) {
		return em.find(Teacher.class,id);
	}
	public List<Teacher> getTeacherById(String name) {
		String q = "select t from Teacher t where t.name=?1";
		Query query = em.createQuery("q");
		query.setParameter(1, name);
		List list = query.getResultList();
		return list;	
	}
	public boolean updateTeacher(Teacher teacher) {
		return true;
	}
	public void deleteTeacher(int id) {
	}
}
