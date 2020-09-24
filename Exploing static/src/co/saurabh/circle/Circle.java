package co.saurabh.circle;

public class Circle {
	private double radius;
	private static  final double  pi= 3.142;
	private static int counter = 1;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void printArea() {
		double area = pi * radius * radius;
		System.out.println("Area "+ counter++ +" =" + area);
	}
}
