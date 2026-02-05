package com.cdgn.service1;

import java.util.Scanner;

public class RightTriangle4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
		for(int j=n ;j>=i;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
		}
		sc.close();
	}
}
