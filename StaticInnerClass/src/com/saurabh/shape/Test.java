package com.saurabh.shape;

import java.util.Scanner;

import com.saurabh.shape.Shape.Rectangle;
import com.saurabh.shape.Shape.Triangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice 1)Rectangle, 2)Triangle");
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Shape.Rectangle rect =  new Rectangle(); 
			double area = rect.CalculateArea();
			System.out.println(area);
			break;
			
		case 2:
			Shape.Triangle tri = new Triangle(); 
			area = tri.CalculateArea();
			System.out.println(area);
			break;
		}
	}

}
