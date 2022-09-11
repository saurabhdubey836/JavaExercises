package com.app.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
		@SuppressWarnings("deprecation")
		String hqlQuery = "from com.app.model.Employee";
		Query q = s.createQuery(hqlQuery);
		List<Employee> empList = q.list();
		System.out.println(empList);
		
//		Transaction tx = s.beginTransaction();
		
		
		//Employee e = new Employee("ABCD",1000.0f,"MUM");
		
//		Employee employee  = s.get(Employee.class,1);
//		System.out.println(employee);
		//s.save(e);
		//tx.commit();

	}

}
