package co.saurabh.string;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String number;
        
        number = sc.nextLine();
        
        StringBuilder input = new StringBuilder();
        
        input.append(number);
        
        input=input.reverse();
        String input1 = input.toString();
        System.out.println(Integer.parseInt(input1));
	}
}
