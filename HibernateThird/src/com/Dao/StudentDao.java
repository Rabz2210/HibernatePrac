package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bean.Student;

public class StudentDao {
		
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	
	public void addData(Student sobj) {
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.persist(sobj);
		t.commit();
		session.close();
		System.out.println("insertion done in Dao");
	}

}
