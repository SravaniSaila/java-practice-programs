package com.Conditional;

import java.util.Scanner;

public class EligibilityChecker2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = obj.next();
		
		System.out.println("Enter your age:");
		int age = obj.nextInt();
		if(age < 0 || age > 100) {
			System.out.println("Please enetr valid age ( 0 <= age <= 100");
		}
		
		else {
		
		if(age >= 18) {
			System.out.println("Hello" + name + "uoy are eligible for vote");
		}
		
		else {
			System.out.println("Hello" + name + "you are not eligible for vote");
		}
		}
		obj.close();
		}

}
