package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_details")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="e_id")
	private int eId;
	@Column(name="e_name")
	private String eName;
	@Column(name="e_salary")
	private float salary;
	@Column(name="e_addr")
	private String addr;
	
	public Employee(String eName,float salary,String addr) {
		this.eName = eName;
		this.salary = salary;
		this.addr = addr;
	}
}