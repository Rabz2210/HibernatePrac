package com.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bean.Student;

public class StudentDao {
		
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	
	public void addData(Student sobj) {
		
		try {
			Session session = sf.openSession();
			Transaction t = session.beginTransaction();
			session.persist(sobj);
			t.commit();
			session.close();
			System.out.println("insertion done in Dao");
		} catch (HibernateException e) {
			System.out.println("error in data insertion");
			e.printStackTrace();
		}
	}
	
	public Student showData(int id) {
		
		Student obj = new Student();
		
		try {
			
			Session session = sf.openSession();
			Transaction t = session.beginTransaction();
			obj=(Student) session.get(Student.class, id);
			System.out.println(obj);
			t.commit();
			session.close();
		} catch (HibernateException e) {
			System.out.println("error in data retrieval");
			e.printStackTrace();
		}
		
		return obj;
	}

}
