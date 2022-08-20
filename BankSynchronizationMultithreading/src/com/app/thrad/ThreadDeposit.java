package com.app.thrad;

import com.app.bank.Bank;
import com.app.exception.InvalidAccountNumber;

public class ThreadDeposit extends Thread{
	
	Bank object;
    String name;
    int dollar;
    int accountNumber;
    
    public ThreadDeposit(Bank ob, String name, int money,int accountNumber)
    {
        this.object = ob;
        this.name = name;
        this.dollar = money;
        this.accountNumber = accountNumber;
    }
 
    public void run() { try {
		Bank.Deposit(name, dollar,accountNumber);
	} catch (InvalidAccountNumber e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} }
}
