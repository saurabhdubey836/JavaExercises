package com.app.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_details")
@SecondaryTables({
	@SecondaryTable(name = "stu_fees", pkJoinColumns = @PrimaryKeyJoinColumn(name="sId")),
	@SecondaryTable(name = "stu_grades", pkJoinColumns = @PrimaryKeyJoinColumn(name="sId"))
})
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="s_id")
	private int sId;
	@Column(name = "s_name")
	private String sName;
	
	@ElementCollection
	@CollectionTable(name = "stu_courses", joinColumns = @JoinColumn(name = "sId"))
	@OrderColumn(name = "pos")
	@Column(name = "s_courses")
	private List<String> courses;
	
	@ElementCollection
	@CollectionTable(name = "stu_lectures", joinColumns = @JoinColumn(name = "sId"))
	@Column(name = "s_lectures")
	private Map<Integer,String>lectures;
	
	@ElementCollection
	@CollectionTable(name = "stu_projects", joinColumns = @JoinColumn(name = "sId"))
	@Column(name = "s_projects")
	private Set<String> stuProjects;
	
	@Column(table="stu_fees",name = "stu_fee")
	private float fees;
	
	@Column(table="stu_grades",name = "stu_grade")
	private String grades;
	
	
	public Student(String sName, List<String> courses, Map<Integer, String> lectures, Set<String> stuProjects, float fees,
			String grades) {
		super();
		this.sName = sName;
		this.courses = courses;
		this.lectures = lectures;
		this.stuProjects = stuProjects;
		this.fees = fees;
		this.grades = grades;
	}
	
	
}
