package com.version1;

import java.util.Scanner;

public class TernaryExample2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = obj.next();
		
		System.out.println("Enter Your age:");
		int age = obj.nextInt();
		
		String msg1 = "Enter valid age";
		String msg2 = "Hello" + name + "you are eligible for vote";
		String msg3 = "Hello" + name + "you are not eligible for vote";
		
		String result = (age < 0 || age > 100) ? msg1 : ((age >= 18) ? msg2 : msg3);
		
		System.out.println(result);
		
		obj.close();
		}

}
