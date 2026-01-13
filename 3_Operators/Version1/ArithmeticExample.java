package com.version1;

import java.util.Scanner;

public class ArithmeticExample {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x value:");
		int x = obj.nextInt();
		
		System.out.println("Enter y value");
		int y = obj.nextInt();
		
		System.out.println("Addition is " + (x + y));
		System.out.println("Subtractiontion is " + (x - y));
		System.out.println("Multiplication is " + (x * y));
		System.out.println("Division is " + (x / y));
		System.out.println("Modulus is " + (x % y));
		
		obj.close();
		}

}
