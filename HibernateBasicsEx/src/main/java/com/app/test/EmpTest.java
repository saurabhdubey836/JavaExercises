package com.app.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class EmpTest {

	public static void main(String[] args) {

		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		
		List<String> addr = new ArrayList<>(Arrays.asList("MUM","DEL","HYD"));
		
		Set<String> prjs = new HashSet<>();
		Collections.addAll(prjs, "Prj1","Prj2");
		
		Map<Integer, String> codes = new HashMap<Integer, String>();
		codes.put(1, "XYZ");
		codes.put(2, "ABC");
		
		Employee e = new Employee("ABCD", 1000, addr, prjs, codes, 2000, 5000);
		System.out.println(e.toString());
		s.save(e);
		tx.commit();
	}

}
