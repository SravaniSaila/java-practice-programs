package com.cdgn.service1;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int cols = sc.nextInt();
		System.out.print("Enter no of cols: ");
		int rows = sc.nextInt();
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j<=cols ; j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		sc.close();
		
	}

}
