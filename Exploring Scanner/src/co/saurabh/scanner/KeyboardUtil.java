package co.saurabh.scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KeyboardUtil {
	private KeyboardUtil() {
		
	}
	public static int getInt(String message) {
		System.out.print(message);
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	public static double getDouble(String message) {
		System.out.print(message);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	public static String getString(String message) {
		System.out.print(message);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static Date getISODate(String message) {
		System.out.print(message);
		String pattern = "yyyy-MM-dd" ;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			// TODO: handle exception
			return null;
		}
	}
}
