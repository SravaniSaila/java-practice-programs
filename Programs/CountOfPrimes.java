package com.controlStatements;

import java.util.Scanner;

public class CountOfPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new number");
		int n =sc.nextInt();
		int primescount=0;
		for(int i=1;i<=n ;i++) {
			int factorscount=0;
			for(int j =1; j<= i;j++) {
				if(i%j==0) factorscount++;
			}
			if(factorscount==2){
				primescount++;
			}
		}
		System.out.println("Number of primes upto "+n+" is "+primescount);
		sc.close();
	}
}
