package co.saurabh.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program02 {
	public static void main(String[] args) {
		Date dt = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		sdf.setLenient(false);
		System.out.println(sdf.format(dt));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
		sdf1.setLenient(false);
		System.out.println(sdf1.format(dt));
		
		System.out.println("Enter your date of Birth in DD-MM-YYYY format:- ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		try {
			dt = sdf.parse(input);
			System.out.println(dt);
		} catch (ParseException e) {
			System.out.println("Invalid Date");
		}
		sc.close();
	}
}
