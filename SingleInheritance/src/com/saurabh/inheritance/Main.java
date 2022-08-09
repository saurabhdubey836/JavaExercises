package com.saurabh.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Name");
		String name = br.readLine();
		System.out.println("Enter Date of Birth");
		String DOB = br.readLine();
		System.out.println("Enter Gender");
		String gender = br.readLine();
		System.out.println("Enter Mobile Number");
		String mobile = br.readLine();
		System.out.println("Enter blood group");
		String bg = br.readLine();
		System.out.println("Enter Blood Bank name");
		String bbn = br.readLine();
		System.out.println("Enter Donor Type");
		String donorType = br.readLine();
		System.out.println("Enter Donation date");
		String donationDate = br.readLine();
		
		Person pr = new Donor(name,DOB,gender,mobile,bg,bbn,donorType,donationDate);
		
		System.out.println(pr);
	}

}
