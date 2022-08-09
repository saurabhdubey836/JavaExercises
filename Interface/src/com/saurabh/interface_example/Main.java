package com.saurabh.interface_example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose stall type");
		System.out.println("1)Gold Stall");
		System.out.println("2)Premium Stall");
		System.out.println("3)Executive Stall");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter stall details in comma seperated(Stall Name"
					+ ",Stall Cost,Owner Name,Number of TV Sets)");
			String st = sc.next();
			String[] str1 = st.split(",");
			GoldStall gs = new GoldStall(str1[0],Integer.parseInt(str1[1]),
					str1[2],Integer.parseInt(str1[3]));
			gs.display();
			break;
		
		case 2:
			System.out.println("Enter stall details in comma seperated(Stall Name"
					+ ",Stall Cost,Owner Name,Number of projectors)");
			String st1 = sc.next();
			String[] str11 = st1.split(",");
			PremiumStall ps = new PremiumStall(str11[0],Integer.parseInt(str11[1]),
					str11[2],Integer.parseInt(str11[3]));
			ps.display();
			break;
			
		case 3:
			System.out.println("Enter stall details in comma seperated(Stall Name"
					+ ",Stall Cost,Owner Name,Number of screen)");
			String st2 = sc.next();
			String[] str2 = st2.split(",");
			ExecutiveStall ex = new ExecutiveStall(str2[0],Integer.parseInt(str2[1]),
					str2[2],Integer.parseInt(str2[3]));
			ex.display();
			break;
			
		default:System.out.println("Invalid input");
			break;
		}
	}

}
