package co.saurabh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
	public static Date addHoursToDate(Date date,int hours) {
		
		Calendar cal = Calendar.getInstance();
		/*
		 * The getInstance() method in Calendar class is used 
		 * to get a calendar using the current time zone and 
		 * locale of the system.
		 * */
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, hours);
	
		return cal.getTime();
	}
	public static Date subMinsToDate(Date date,int minutes) {
		
		Calendar cal = Calendar.getInstance();
		/*
		 * The getInstance() method in Calendar class is used 
		 * to get a calendar using the current time zone and 
		 * locale of the system.
		 * */
		cal.setTime(date);
		cal.add(Calendar.MINUTE, -minutes);
	
		return cal.getTime();
	}
public static TimeZone getDateObj(Date date) {
		
		Calendar cal = Calendar.getInstance();
		/*
		 * The getInstance() method in Calendar class is used 
		 * to get a calendar using the current time zone and 
		 * locale of the system.
		 * */
		return cal.getTimeZone();
		
	}
	public static void main(String[] args) {
		
		Date df = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		System.out.println(sdf.format(df));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		System.out.println(sdf1.format(df));
		
		Date date = new Date();
		System.out.print("Enter number of Hours to add:- ");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		date = addHoursToDate(df, hour);
		System.out.println(date);
		
	
		System.out.print("Enter number of minutes to subtract:- ");
		int min = sc.nextInt();
		date = subMinsToDate(df, min);
		System.out.println(date);
		
		System.out.println(Calendar.MINUTE);
		
		

	}
}
