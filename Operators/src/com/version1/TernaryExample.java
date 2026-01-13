package com.version1;

import java.util.Scanner;

public class TernaryExample {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = obj.next();
		
		System.out.println("Enter Your age:");
		int age = obj.nextInt();
		
		String result = (age >= 18) ? "Hello" + name + "You ar eligible for vote" : "Hello" + name + "You are not eligible for vote";
		
		System.out.println(result);
		
		obj.close();
		}

}
