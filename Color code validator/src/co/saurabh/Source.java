package co.saurabh;

import java.util.Scanner;

import co.saurabh.validator.ColourCodeValidator;

public class Source {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        //ColourCodeValidator color = new ColourCodeValidator();
	        if(choice==1){
	            String code = sc.next();
	            int m =ColourCodeValidator.validateHexCode(code);
	            if(m==1){
	                System.out.println("Valid Code");
	            }else{
	                System.out.println("Invalid Code");
	            }
	        }else if(choice==2){
	            String code = sc.next();
	            int m = ColourCodeValidator.validateDecimalCode(code);
	            if(m==1){
	                System.out.println("Valid Code");
	            }else{
	                System.out.println("Invalid Code");
	            }
	        }else{
	            System.out.println("Invalid choice");
	        }
	    }
}

