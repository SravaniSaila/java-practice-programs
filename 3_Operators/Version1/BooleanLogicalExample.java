package com.version1;

import java.util.Scanner;

public class BooleanLogicalExample {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x value:");
		int x = obj.nextInt();
		
		System.out.println("Enter y value");
		int y = obj.nextInt();
		
		System.out.println((x == y) || (x > y)); 
		System.out.println((x != y) && (x>y)); 
		System.out.println(!(x < y) ); 
		
		obj.close();
		}

}
