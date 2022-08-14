package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class EmpTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
//		Transaction tx = session.beginTransaction();
//		Employee e = new Employee(11,"ABCD", "MUM", "P33", "PC1");
//		session.save(e);
//		tx.commit();
		
		Employee e = session.load(Employee.class, 11);
		System.out.println(e);
		
		
		
	}

}
