package co.saurabh.scanner;
import java.util.Date;

public class Project01 {
	public static void main(String[] args) {
		String name;
		int age;
		double height;
		Date date;
		
		name = KeyboardUtil.getString("Enter your name please:- ");
		age = KeyboardUtil.getInt("Enter your Age:- ");
		height = KeyboardUtil.getDouble("Enter your height:- ");
		date = KeyboardUtil.getISODate("Enter your DOB in yyyy-mm-dd format:- ");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(date);
	}
}
