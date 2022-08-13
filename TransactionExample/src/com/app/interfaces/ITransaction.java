package com.app.interfaces;

import com.app.Exceptions.InsufficientBalance;
import com.app.Exceptions.InvalidAccount;

public interface ITransaction {
	
	void checkBalance(int acc) throws InvalidAccount;
	
	void withdraw(int acc,float amount) throws InvalidAccount,InsufficientBalance;
}
