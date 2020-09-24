package co.saurabh;

import co.saurabh.entity.Product;

public class Program01 {
	public static void main(String[] args) {
		Product p1;
		
		p1 = new Product();
		p1.setLname("Dubey");
		p1.setName("Saurabh");
		p1.setPlace("Bhandup");
		
		System.out.println(p1);
		System.out.println();
		
		Product p2 = new Product("Suhash");
		
		System.out.println(p2);
		
	}
}
