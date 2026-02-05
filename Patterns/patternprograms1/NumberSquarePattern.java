package com.cdgn.service1;

import java.util.Scanner;

public class NumberSquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 5;
		int cols = 5;
		int count = 1;
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j<=cols ; j++){
				System.out.print(count+" ");
				count++;
				
				
			}
			System.out.println();
		}
		sc.close();
		
	}

}
