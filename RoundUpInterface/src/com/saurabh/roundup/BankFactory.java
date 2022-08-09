package com.saurabh.roundup;

public class BankFactory {

	public Icici getIcici() {
		
		return new Icici();
	}
	
	public Hdfc getHdfc() {
		
		return new Hdfc();
	}
}
