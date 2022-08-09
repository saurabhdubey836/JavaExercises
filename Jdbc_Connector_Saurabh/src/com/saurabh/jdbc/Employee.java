package com.saurabh.jdbc;

public class Employee extends Object{
	private int eno;
	private String ename;
	private float esal;
	private String eadd;
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eadd=" + eadd + "]";
	}

	Employee(){
		
	}
	
	public int getEno() {
		return eno;
	}
	public Employee(int eno, String ename, float esal, String eadd) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eadd = eadd;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}		
}
