package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Student;
import com.app.util.HibernateUtility;

public class StudentDao implements IStudentDao {

	@Override
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession()){
			//start the Transaction
			transaction = session.beginTransaction();
			
			//save the student object
			session.save(student);
			//commit the transaction
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}			
		}
	}
	
	@Override
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession()){
			//start the Transaction
			transaction = session.beginTransaction();
			
			//save the student object
			session.saveOrUpdate(student);
			//commit the transaction
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}			
		}
	}
	
	@Override
	public Student getStudentById(long id) {
		Transaction transaction = null;
		Student student = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession()){
			//start the Transaction
			transaction = session.beginTransaction();
			
			//get student object
			student = session.get(Student.class,id);

			//commit the transaction
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}			
		}
		return student;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		Transaction transaction = null;
		List<Student> students = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession()){
			//start the Transaction
			transaction = session.beginTransaction();
			
			//get student object
			students = session.createQuery("from Student").list();

			//commit the transaction
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}			
		}
		return students;
	}
	
	@Override
	public Student deleteStudent(long id) {
		Transaction transaction = null;
		Student student = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession()){
			//start the Transaction
			transaction = session.beginTransaction();
			
			//get student object
			student = session.get(Student.class,id);
			session.delete(student);
			//commit the transaction
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}			
		}
		return student;
	}
	
}
