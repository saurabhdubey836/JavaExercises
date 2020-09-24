package co.saurabh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program02 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a path to read:- ");
		String path = sc.nextLine();
		FileReader reader = new FileReader(path);
		
		BufferedReader br  = new BufferedReader(reader);
		String line;
		
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
		sc.close();
	}
}
