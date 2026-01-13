package com.version4;

public class Circle {
	double radius;
	static final double PI = 3.14;
	
	public void printArea() {
		//for intermediate calculations local variable is used
		//double area = PI * radius * radius; //local variable
		
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of circle is" + area);
	}
	
	public void printPerimeter(){
		double pm = 2 * PI * radius; //instance variable
		//double pm = 2 * Math.PI * radius;
		System.out.println("Perimeter of circle is " + pm);
	}
}
