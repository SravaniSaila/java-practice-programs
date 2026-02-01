package com.specialNumbers;

import java.util.Scanner;

public class RangeOfStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		for(int n = 1; n <=x ; n++) {
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
		if(n == sum) System.out.print(n +" ");
		
		sc.close();
		}
	}

}
