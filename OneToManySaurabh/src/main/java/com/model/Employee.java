package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empTable")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String eName;
	
	//1...1  non coll. 
	@OneToMany(cascade = CascadeType.ALL)
	//+@JoinColumn(name="roleIdFk" , unique = true) //OneToOne
	@JoinColumn(name="roleIdFk") // ManyToOne
	private List<Role> role;  // HAS-A relation
}
