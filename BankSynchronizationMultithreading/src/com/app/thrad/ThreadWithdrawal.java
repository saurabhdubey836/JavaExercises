package com.app.thrad;

import com.app.bank.Bank;
import com.app.exception.InvalidAccountNumber;

public class ThreadWithdrawal extends Thread {
	
	Bank bank;
	String name;
	int amount;
	int accountNumber;
	
	public ThreadWithdrawal(Bank ob, String name, int money,int accountNumber)
    {
        this.bank = ob;
        this.name = name;
        this.amount = money;
        this.accountNumber = accountNumber;
    }
	public void run() {
		try {
			Bank.withdrawn(name, amount, accountNumber);
		} catch (InvalidAccountNumber e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
