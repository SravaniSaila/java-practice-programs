package com.cdgn.service1;

public class NumbersTriangle {

	public static void main(String[] args) {
		int rows = 5;
		int cols = 5;
		
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j <=i ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
