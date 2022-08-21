package com.app.model;

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
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "emp_details")
@SecondaryTable(name = "emp_add", pkJoinColumns = @PrimaryKeyJoinColumn(name="eId"))

//@SecondaryTables({
//	@SecondaryTable(name = "emp_add", pkJoinColumns = @PrimaryKeyJoinColumn(name="eId")),
//	@SecondaryTable(name = "emp_add", pkJoinColumns = @PrimaryKeyJoinColumn(name="eId"))
//})
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="e_id")
	private int eId;
	@Column(name="e_name")
	private String eName;
	@Column(name="e_salary")
	private float salary;
	
	@ElementCollection
	@CollectionTable(name="emp_addr", joinColumns = @JoinColumn(name="eId"))
	@OrderColumn(name="pos")
	@Column(name="e_addr")
	private List<String> empAddr;
	
	@ElementCollection
	@CollectionTable(name="emp_prjs", joinColumns = @JoinColumn(name="eId"))
	@Column(name="e_prjs")
	private Set<String> empPrjs;
	
	@ElementCollection
	@CollectionTable(name="emp_codes", joinColumns = @JoinColumn(name="eId"))
	@Column(name="e_codes")
	private Map<Integer, String> empCodes;
	
	@Column(table ="emp_add" ,name="e_bonus")
	private float bonus;
	@Column(table ="emp_add" ,name="e_incentive")
	private float incentive;
	public Employee(String eName, float salary, List<String> empAddr, Set<String> empPrjs,
			Map<Integer, String> empCodes, float bonus, float incentive) {
		super();
		this.eName = eName;
		this.salary = salary;
		this.empAddr = empAddr;
		this.empPrjs = empPrjs;
		this.empCodes = empCodes;
		this.bonus = bonus;
		this.incentive = incentive;
	}
	
}
