package com.app.test;

import com.app.bank.Bank;
import com.app.thrad.ThreadDeposit;
import com.app.thrad.ThreadWithdrawal;

public class Test {

	public static void main(String[] args) {
		Bank obj = new Bank();
		 
        // Creating threads
        ThreadWithdrawal t1
            = new ThreadWithdrawal(obj, "Arnab", 20, 1000);
        ThreadWithdrawal t2
            = new ThreadWithdrawal(obj, "Monodwip", 40,1000);
        ThreadDeposit t3
            = new ThreadDeposit(obj, "Mukta", 35,1000);
        ThreadWithdrawal t4
            = new ThreadWithdrawal(obj, "Rinkel", 80,1000);
        ThreadWithdrawal t5
            = new ThreadWithdrawal(obj, "Shubham", 40,1000);
 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
	}

}
