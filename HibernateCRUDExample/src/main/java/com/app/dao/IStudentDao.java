package com.app.dao;

import java.util.List;

import com.app.model.Student;

public interface IStudentDao {

	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(long id);

	List<Student> getAllStudents();

	Student deleteStudent(long id);

}