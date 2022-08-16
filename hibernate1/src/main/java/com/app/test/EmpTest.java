package com.app.test;

import org.hibernate.Transaction;
import com.app.connection.Connection;

import hibernate1.Employee;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction tx = Connection.Connection1().beginTransaction();
		Employee e = new Employee("ABCDE","PUN","P33","PC1");
		Connection.Connection1().save(e);
		tx.commit();
	}
}
