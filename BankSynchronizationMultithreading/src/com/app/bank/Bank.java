package com.app.bank;

import com.app.exception.InvalidAccountNumber;

public class Bank {
	public static int total = 100;
	private static int accountNumber = 1000;
	
	public static synchronized void withdrawn(String name, int withdrawal,int accountNumber) throws InvalidAccountNumber {
		if(accountNumber == Bank.accountNumber) {
			if(total > withdrawal) {
				System.out.println(name + " Withdrawn "+ withdrawal);
				total = total - withdrawal;
				System.out.println("Balance after withdrawal :- "+total);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(total < withdrawal){
				System.out.println("You cannot withdraw "+ withdrawal);
				System.out.println("Your balance is total "+ total);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				throw new InvalidAccountNumber("Invalid Account");
			}
		}
		else {
			System.out.println("Invalid Balance");
		}
	}
	
	public static synchronized void Deposit(String name, int deposit,int accountNumber) throws InvalidAccountNumber {
		if(accountNumber == Bank.accountNumber) {
			System.out.println(name + " deposited " + deposit);
			total = total + deposit;
			System.out.println("Balance after deposit "+ total);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			throw new InvalidAccountNumber("Invalid Account");
		}
	}
}
