package com.version1;

import java.util.Scanner;

public class AssignmentExample {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x value:");
		int x = obj.nextInt();
		
		System.out.println("Enter y value");
		int y = obj.nextInt();
		
		x += y;
		System.out.println("x is "+ x);
		
		x -= y;
		System.out.println("x is "+ x);
		
		x *= y;
		System.out.println("x is "+ x);
		
		x /= y;
		System.out.println("x is "+ x);
		
		obj.close();
		}

}
