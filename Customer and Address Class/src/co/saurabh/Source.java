package co.saurabh;
import java.util.Scanner;
public class Source {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int customerId = sc.nextInt();  
		String customerName = sc.next();
		String password = sc.next();
		String email  = sc.next();
		//String address = sc.nextLine();
		
		
	
		String city = sc.next();
		String state = sc.next();
		int zip = sc.nextInt();
		String country = sc.nextLine();
		
		Customer cust = new Customer(customerId,customerName,password,email);
		Address add = new Address(city,state,zip,country,cust);
		
		add.print();
		
		
	}
}
