package com.test;

import java.util.Scanner;

import com.app.Exceptions.InsufficientBalance;
import com.app.Exceptions.InvalidAccount;
import com.app.transaction.Transaction;

public class Main {

	public static void main(String[] args) throws InvalidAccount, InsufficientBalance {
		// TODO Auto-generated method stub
		Transaction transact = new Transaction();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice");
			System.out.println("1)Check Balance");
			System.out.println("2)WithDraw Amount");
			choice  = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Check Balance");
				int account = sc.nextInt();
				transact.checkBalance(account);
				break;
				
			case 2:
				System.out.println("WithDraw Amount");
				System.out.println("Enter amount to withraw");
				float amount = sc.nextFloat();
				System.out.println("Please Enter your account");
				int account1  = sc.nextInt();
				transact.withdraw(account1, amount);
				break;
				
			default: 
				System.out.println("Invalid choice");
			}
		}while(choice !=3);
		
	}

}
