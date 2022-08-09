package com.saurabh.roundup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BankFactory bankFactory = new BankFactory();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to notification setup \n Please select your bank \n 1)ICICI \n 2)HDFC");
		int select = Integer.parseInt(br.readLine());
		
		if(select == 1) {
			Icici icici = bankFactory.getIcici();
			System.out.println("Enter the Notification you want to"
					+ "enter \n1) SMS\n2)Mail \n3)Courier");
			int notificationChoice = Integer.parseInt(br.readLine());
			
			switch(notificationChoice) {
				case 1: icici.notificationBySms();
				break;
				
				case 2: icici.notificationsByEmail();
				break;
				
				case 3: icici.notificationsByCourier();
				break;
				
				default: System.out.println("wrong input");
				break;
			}
		}
		else if(select == 2) {
			Hdfc hdfc = bankFactory.getHdfc();
			System.out.println("Enter the Notification you want to"
					+ "enter \n1) SMS\n2)Mail \n3)Courier");
			int notificationChoice = Integer.parseInt(br.readLine());
			
			switch(notificationChoice) {
				case 1: hdfc.notificationBySms();
				break;
				
				case 2: hdfc.notificationsByEmail();
				break;
				
				case 3: hdfc.notificationsByCourier();
				break;
				
				default: System.out.println("wrong input");
				break;
			}
		}
		else {
			System.out.println("Wrong input");
		}
	}

}
