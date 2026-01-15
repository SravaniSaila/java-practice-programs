package com.Conditional;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter ypur percentage");
		double percentage = obj.nextInt();
		
		if(percentage < 0 || percentage > 100)
		{
			System.out.println("Enter valid percentage");
		}
		else {
		
		if(percentage > 90) {
			System.out.println("A grade");
		}
		else if(percentage > 70) {
			System.out.println("A grade");
		}
		else if(percentage > 55) {
			System.out.println("A grade");
		}
		if(percentage >= 40) {
			System.out.println("A grade");
		}
		else {
			System.out.println("Failed");
		}
		obj.close();
		}
	}

}
