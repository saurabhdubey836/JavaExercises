package com.app.transaction;

import java.util.Scanner;

import com.app.Exceptions.InsufficientBalance;
import com.app.Exceptions.InvalidAccount;
import com.app.interfaces.ITransaction;

public class Transaction implements ITransaction {

	static float Balance = 20000;
	@Override
	public void checkBalance(int acc) throws InvalidAccount{
		if(acc!=1000) {
			throw new InvalidAccount("Account is not valid");
		}
		else {
			System.out.println("Current Balance :-"+Balance);
		}
	}

	@Override
	public void withdraw(int acc, float amount) throws InvalidAccount,InsufficientBalance {
		// TODO Auto-generated method stub
		if(acc != 1000) {
			throw new InvalidAccount("Account is not valid");
		}else if(acc == 1000) {
			try{
				if(Balance < 1000 && Balance > 0 ) {
					Balance = (Balance - amount);
					System.out.println("Balance :-" + Balance);
				}
				else {
					throw new InsufficientBalance("Insufficient Balance");
				}
			}
			catch(Exception ex){
				//System.out.println("Balance is less than 1000");
			}
		}
	}

}
