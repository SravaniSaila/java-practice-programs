package com.controlStatements;

import java.util.Scanner;

public class RangeOfFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int x =sc.nextInt();
		for(int n=1; n<=x;n++) {
			System.out.print("factors of "+n +":");
		for(int i = 1; i <= n ; i++) {
			if(n%i==0) System.out.print(i+" ");
		}
		System.out.println();
		}
		sc.close();

	}

}
