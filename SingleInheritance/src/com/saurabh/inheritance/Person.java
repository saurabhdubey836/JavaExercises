package com.saurabh.inheritance;

public class Person {
	String name;
	String DateOfBirth;
	String gender;
	String mobileNumber;
	String bloodGroup;
	
	public Person(String name, String dateOfBirth, String gender, String mobileNumber, String bloodGroup) {
		super();
		this.name = name;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", DateOfBirth=" + DateOfBirth + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + ", bloodGroup=" + bloodGroup + "]";
	}	
}
