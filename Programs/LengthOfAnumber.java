package com.controlStatements;

import java.util.Scanner;

public class LengthOfAnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count=0;
		while(n>0) {
			n /=10;
			count++;
		}
		System.out.println("length od number is"+count);
		sc.close();
	}
}
