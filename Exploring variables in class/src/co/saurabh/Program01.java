package co.saurabh;

import co.saurabh.entity.product.Product;

public class Program01 {
	
	public static void main(String[] args){
		Product p1,p2;
		
		p1 = new Product(10);
		p2 = new Product(20);
		//p1.set_id(10);
		p1.setName("Optical Mouse");
		p1.setPrice(10.20);
		
		p1.print(p1);// valid in java
		Product.print(p1);// THis is already valid
		Product.print(p2);
		
	}
	

}
