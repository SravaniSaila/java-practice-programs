package com.Conditional;

import java.util.Scanner;

public class EligibilityChecker {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = obj.next();
		
		System.out.println("Enter your age:");
		int age = obj.nextInt();
		
		if(age >= 18) {
			System.out.println("Hello" + name + "uoy are eligible for vote");
		}
		
		else {
			System.out.println("Hello" + name + "you are not eligible for vote");
		}
		obj.close();
	}

}
