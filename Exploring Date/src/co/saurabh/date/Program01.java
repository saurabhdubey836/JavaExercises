package co.saurabh.date;

import java.text.DateFormat;
import java.util.Date;

public class Program01 {
	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		DateFormat df;
		
		df = DateFormat.getDateTimeInstance();
		System.out.println(df.format(dt));
		
		df = DateFormat.getDateInstance();
		System.out.println(df.format(dt));
		
		df = DateFormat.getTimeInstance();
		System.out.println(df.format(dt));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(dt));
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(dt));
		

		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(dt));
		
		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(dt));
	}
}
