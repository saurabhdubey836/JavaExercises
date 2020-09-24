package co.saurabh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChangeDateFormat {
	public static void main(String[] args) throws ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			String old_format = "dd/MM/yyyy";
			String new_format = "yyyy-MM-dd";
			
			String old_date = sc.nextLine();
			String new_date;
			
			SimpleDateFormat sdf = new SimpleDateFormat(old_format);
			Date date = new Date();
			
			date = sdf.parse(old_date);
			sdf.applyPattern(new_format);
			new_date = sdf.format(date);
			
			System.out.println(new_date);
		}
	
		
	}
}
