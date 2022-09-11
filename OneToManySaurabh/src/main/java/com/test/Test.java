package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import com.model.Role;

public class Test {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
	
		//one Emp
		//one Role
		List<Role> role = new ArrayList<>();
		Role r = new Role();
		r.setRoleName("DEV");
		Role r1 = new Role();
		r1.setRoleName("ADMIN");
		Employee e = new Employee();
		e.setEName("PQR");
		Collections.addAll(role, r,r1);
		e.setRole(role);
		
		
		List<Role> role2 = new ArrayList<>();
		Role r2 = new Role();
		r2.setRoleName("DEV-OPS");
		Role r3 = new Role();
		r3.setRoleName("Manager");
		Employee e1 = new Employee();
		e1.setEName("STU");
		Collections.addAll(role2, r2,r3);
		e1.setRole(role2);
		
		//save operation
		//session.save(r);
		session.save(e);
		session.save(e1);
		tx.commit();
		
	}

}
