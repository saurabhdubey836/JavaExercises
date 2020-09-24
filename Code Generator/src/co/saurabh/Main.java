package co.saurabh;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CodeGenerator c = new CodeGenerator();
		
		StringBuilder sb= new StringBuilder(sc.nextLine());
		
		StringBuilder reverseStr = sb.reverse();
		String result = c.generateCode(reverseStr.toString());
		
		System.out.println(result);
	}
}
