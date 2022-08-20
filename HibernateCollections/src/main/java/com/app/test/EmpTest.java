package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.app.model.Employee;
import com.app.util.HibernateUtility;

public class EmpTest {

	public static void main(String[] args) {
		Transaction tx = null;
		try(Session s = HibernateUtility.getSessionFactory().openSession()){
			tx = s.beginTransaction();
			Employee e = new Employee("Sans", "Badlapur");
			s.save(e);
			tx.commit();
		}catch(Exception e) {
			System.out.println("Exception");
			tx.rollback();
		}
		
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		Session s = sf.openSession();
//		Employee e = new Employee("Saurabh", "Mumbai");
//		Transaction tx = s.beginTransaction();
//		s.save(e);
//		tx.commit();
	}
}
