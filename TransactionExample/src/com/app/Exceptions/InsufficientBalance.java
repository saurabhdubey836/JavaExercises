package com.app.Exceptions;

public class InsufficientBalance extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InsufficientBalance(String message){
		System.out.println(message);
	}

}
