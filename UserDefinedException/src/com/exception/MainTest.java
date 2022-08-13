package com.exception;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws LoginException {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the login username");
			String userName = sc.nextLine();
			System.out.println("Enter the password");
			String password = sc.nextLine();
			
			Login(userName, password);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	private static void Login(String userName, String password) throws LoginException {
		if(userName.equals("ABC") && password.equals("123")) {
			System.out.println("Login Successfull");
		}
		else {
			throw new LoginException("Invalid usename or password");
		}
	}

}
