package co.saurabh.Factorial;

import java.util.Scanner;

public class Factorial {
	 public static long factorial(int n){
	        long fact = 1;
	    	for (int i = 2; i <= n; i++) {
	        	fact = fact * i;
	    	}
	    	return fact;
	    }
		public static void main(String[] args) {
			// Write your code here
			int choice,n;
	        Scanner in = new Scanner(System.in);
	        
	        n = in.nextInt();
	        choice = in.nextInt();
	        
	        switch(choice){
	            case 1: int sum=0;
	                	sum = n*(n+1);
	                	System.out.println(sum/2);
	            		break;
	            case 2: long product=1;
	                	product = factorial(n);
	                	System.out.println(product);
	            		break;
	            default:break;
	        }
		}
		
}
