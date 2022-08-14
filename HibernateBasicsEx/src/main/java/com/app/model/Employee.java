package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etab")
public class Employee {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private String empAddr;
	private String projs;
	
	private String pcode;
	
	
}
