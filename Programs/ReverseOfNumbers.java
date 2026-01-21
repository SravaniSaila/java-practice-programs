package com.controlStatements;
import java.util.Scanner;

public class ReverseOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int rev=0;
		while(n>0) {
			int digit = n%10;
			rev =rev * 10+digit;
			n/=10;
		}
		System.out.println(rev);
		sc.close();
	}
}
//The reverse is 21, because leading zeros are not preserved in integers.
