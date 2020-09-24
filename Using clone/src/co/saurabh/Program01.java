package co.saurabh;

import co.saurabh.entity.Product;

public class Program01 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Product p1 = new Product("Srikant","Shinde","Maharashtra");
		Product p2= new Product();
		
		p2 = p1.replicate();
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("p1==p2 ? "+ (p1==p2));
		System.out.println("p1==p2 ? "+ (p1.equals(p2)));
	}
}
