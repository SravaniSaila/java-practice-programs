package com.specialNumbers;

import java.util.Scanner;

public class XylemNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		
		int lastd = n % 10;
		n = n/10;
		int first = 0;
		int midsum=0;
		while(n>10) {
			int rem = n %10;
			midsum += rem;
			n/=10;
		}
		first = n;
		int firstlastsum = first + lastd;
		if(firstlastsum == midsum) System.out.println(temp +" is a xylem number");
		else System.out.println(temp +" is not a xylem number");
		
		sc.close();
		}

}
