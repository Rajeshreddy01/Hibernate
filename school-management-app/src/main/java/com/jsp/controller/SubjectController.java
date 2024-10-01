package com.jsp.controller;

import com.jsp.dao.SubjectDao;

public class SubjectController {

	public static void main(String[] args) {
		Subject subject = new Subject("chemistry",8,"ramana");
		SubjectDao dao= new SubjectDao();
		dao.saveSubject(subject);

	}

}
