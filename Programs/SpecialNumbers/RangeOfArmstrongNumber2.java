package com.specialNumbers;

import java.util.Scanner;

public class RangeOfArmstrongNumber2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = obj.nextInt();
		for(int n = 1; n<= x ;n++) {
			
		int temp = n; //temporary variable to store n value
		int count = 0;
		while(n > 0) {
			n /= 10;
			count++;
		}
		
		n = temp;
		int sum = 0;
		while(n > 0) {
			int rem = n%10;
			int power =1;
			for(int i=1; i<=count;i++) {
				power *= rem;
			}
			sum += power;
			n /=10;
		}
		n = temp;
		
		if(n == sum) System.out.println(n);
		
		}
		obj.close();
	}
}
