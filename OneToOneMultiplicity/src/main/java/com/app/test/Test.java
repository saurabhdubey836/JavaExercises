package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.app.model.Address;
import com.app.model.Employee;
import com.app.util.HibernateUtility;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		try(Session s = HibernateUtility.getSessionFactory().openSession()){
			tx = s.beginTransaction();
			
			Address a = new Address();
			a.setAName("Mumbai");
			
			Employee e = new Employee();
			e.setEName("ABC");
			e.setAddress(a);
			
			s.save(e);
			tx.commit();
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
	}

}
