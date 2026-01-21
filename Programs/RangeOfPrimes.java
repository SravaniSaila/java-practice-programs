package com.controlStatements;

import java.util.Scanner;

public class RangeOfPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		for(int i=1;i<=n ;i++) {
			int factorscount=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) factorscount++;
			}
			if(factorscount==2) System.out.print(i+" ");
		}
		sc.close();
	}
}
