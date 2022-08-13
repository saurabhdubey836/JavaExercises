package com.exception;

public class LoginException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginException(String message) {
		System.out.println(message);
	}
	
	public LoginException() {
		this("Invalid usename and pasword");
		System.out.println("Something is fishy");
	}
	
	public void  Message() {
		System.out.println("Invalid input");
	}
}
