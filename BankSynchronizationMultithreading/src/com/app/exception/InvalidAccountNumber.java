package com.app.exception;

public class InvalidAccountNumber extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidAccountNumber(String message) {
		System.out.println("Invalid Account");
	}
}
