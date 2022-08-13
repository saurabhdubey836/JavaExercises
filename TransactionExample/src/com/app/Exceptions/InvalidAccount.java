package com.app.Exceptions;

public class InvalidAccount extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidAccount(String message){
		System.out.println(message);
	}
}
