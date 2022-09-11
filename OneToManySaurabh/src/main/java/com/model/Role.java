package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="roleTable")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	private String roleName;
	
}
