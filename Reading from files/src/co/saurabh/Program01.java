package co.saurabh;

import java.io.FileReader;
import java.util.Scanner;

public class Program01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path to read:- ");
		String path = sc.nextLine();
		
		FileReader reader = new FileReader(path);
		
		int ch ;
		while((ch=reader.read())!=-1) {
			System.out.print((char)ch);
		}
		reader.close();
		sc.close();
		System.out.println("End of Demo..");
	}
}
