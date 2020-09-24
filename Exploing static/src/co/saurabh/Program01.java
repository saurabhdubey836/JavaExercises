package co.saurabh;

import co.saurabh.circle.Circle;

public class Program01 {
	public static void main(String[] args) {
		Circle[] circle = new Circle[10];// array of objects
		
		for(Circle c:circle) {
			c = new Circle(100*Math.random());
			c.printArea();
		}
		
		
	}
}
