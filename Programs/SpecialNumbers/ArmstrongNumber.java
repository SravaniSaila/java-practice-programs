package com.specialNumbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = obj.nextInt();
		int count = 0;
		int temp = n;
		while(n > 0) {
			n /=10;
			count++;
		}
		
		n = temp;
		int sum = 0;
		while(n>0) {
			int power = 1;
			int rem = n %10;
			for(int i = 1 ; i <= count ; i++) {
			power *= rem;
			}
			
			sum += power;
			n /=10;
		}
		n = temp;
		if(sum == n) {
			System.out.println(n +" is armstrong number");
		}
		else {
			System.out.println(n + " is not armstrong number");
		}
		obj.close();
	}

}
