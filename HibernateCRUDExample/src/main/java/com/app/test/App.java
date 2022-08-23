package com.app.test;

import java.util.List;

import com.app.dao.IStudentDao;
import com.app.dao.StudentDao;
import com.app.model.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStudentDao studentDao = new StudentDao();
		Student student = new Student("Ramesh","Fadtare","ramesh@gmail.com");
		
		//test save student
		studentDao.saveStudent(student);
		
		student.setFirstName("Ram");
		studentDao.updateStudent(student);
		
		//test getStudentById
		Student student2 = studentDao.getStudentById(student.getId());
		
		//test getAllStudent
		List<Student> students = studentDao.getAllStudents();
		students.forEach(student1 -> System.out.println(student1.getId()));
		
		//test delete
		studentDao.deleteStudent(student.getId());
		
	}

}
