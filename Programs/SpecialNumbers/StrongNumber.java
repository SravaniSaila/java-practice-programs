package com.specialNumbers;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(n>0) {
			int rem = n %10;
			int fact = 1;
			for(int i = 1; i<= rem ; i++) {
				fact *= i;
			}
			sum += fact;
			n /= 10;
		}
		n = temp;
		if(n == sum) System.out.println(n + " is a strong number");
		
		else System.out.println(n + " is not a strong number");
		sc.close();
	}

}
