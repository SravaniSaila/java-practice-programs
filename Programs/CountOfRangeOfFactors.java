package com.controlStatements;

import java.util.Scanner;

public class CountOfRangeOfFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int n =sc.nextInt();
		for(int i = 1;i<=n ;i++) {
			int count=0;
			for(int j =1;j<=i;j++) {
				if(i%j==0) count++;
			}
			System.out.println("Number of factors of "+i+":"+count);
		}
		sc.close();
	}
}
