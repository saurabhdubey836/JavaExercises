package com.saurabh.inheritance;

public class Donor extends Person {
	
	String bloodBankName;
	String donorType;
	String donationDate;

	public Donor(String name, String dateOfBirth, String gender, String mobileNumber, String bloodGroup,String bloodBankName,
			String donorType,String donationDate) {
		super(name, dateOfBirth, gender, mobileNumber, bloodGroup);
		// TODO Auto-generated constructor stub
		this.bloodBankName = bloodBankName;
		this.donorType = donorType;
		this.donationDate = donationDate;
	}

	
	@Override
	public String toString() {
		return "bloodBankName=" + bloodBankName + ",\n donorType=" + donorType + ",\n donationDate=" + donationDate
				+ ", \n name=" + name + ",\n DateOfBirth=" + DateOfBirth + ",\n gender=" + gender + ",\n mobileNumber="
				+ mobileNumber + ",\n bloodGroup=" + bloodGroup +"";
	}

	public void DisplayDonationDetails() {
		System.out.println("Donor [bloodBankName=" + bloodBankName + ", donorType=" + donorType + ", donationDate=" + donationDate
				+ ", name=" + name + ", DateOfBirth=" + DateOfBirth + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + ", bloodGroup=" + bloodGroup + "]");
	}
	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	
	

}
