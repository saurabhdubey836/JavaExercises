package com.app.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.Student.Student;
import com.app.util.HibernateUtility;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		try(Session s = HibernateUtility.getSessionFactory().openSession()){
			tx = s.beginTransaction();
			
			List<String> courses = new ArrayList<>(Arrays.asList("CS","IT","Mech"));
			
			Set<String> stuProjects = new HashSet<>();
			Collections.addAll(stuProjects, "Data Science","automobile");
			
			Map<Integer, String> lectures = new HashMap<Integer, String>();
			lectures.put(1, "Data Structures");
			lectures.put(2, "Data Science");
			
			Student stu = new Student("Saurabh",courses,lectures,stuProjects,10000.0f,"A");
			
			s.save(stu);
			tx.commit();
		}catch(Exception e) {
			System.out.println("Exception");
			tx.rollback();
		}
	}

}
