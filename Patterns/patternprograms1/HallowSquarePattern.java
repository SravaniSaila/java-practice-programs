package com.cdgn.service1;

import java.util.Scanner;

public class HallowSquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 5;
		int cols = 5;
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j<=cols ; j++){
				if(i ==1 || j== 1|| j== cols|| i==rows) {
				System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+"  ");
				}
			}
			System.out.println();
		}
		sc.close();
		
	}

}
