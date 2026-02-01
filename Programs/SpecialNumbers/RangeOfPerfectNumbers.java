package com.specialNumbers;

import java.util.Scanner;

public class RangeOfPerfectNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		for(int n = 1 ; n <= x; n++) {
		int sum = 0;
		for(int i = 1 ; i < n ; i++) {
			if(n % i ==0) {
				sum +=i;
			}
		}
		if(sum == n) System.out.println(n);
		
		sc.close();
		}
	}

}
