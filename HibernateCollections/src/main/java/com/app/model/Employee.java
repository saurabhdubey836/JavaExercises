package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String eName;
	private String empAddr;
	
	public Employee(String eName,String empAddr) {
		this.eName = eName;
		this.empAddr = empAddr;
	}
}
