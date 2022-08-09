package com.saurabh.shape;

import java.util.Scanner;

public class Shape {
	
	public static class Rectangle{
		public double CalculateArea() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter length");
			double length = sc.nextDouble();
			
			System.out.println("Enter Breadth");
			double breadth = sc.nextDouble();
			
			double area = length * breadth; 
			return area;
		}
		
	}
	public static class Triangle{
		
		public double CalculateArea() {
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter base");
					double base = sc.nextDouble();
					
					System.out.println("Enter Breadth");
					double height = sc.nextDouble();
					
					double area = 0.5 * base * height; 
					return area;
				}
	}
}
