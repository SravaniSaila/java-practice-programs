 package com.controlStatements;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		int n = sc.nextInt();
		int first = 1;
		int second = 1;
		int next  =0;
		for(int i=1;i<=n;i++) {
			System.out.println(first + second);
			next=first+second;
			first = second;
			second = next;
				
		}
		sc.close();
	}
}
