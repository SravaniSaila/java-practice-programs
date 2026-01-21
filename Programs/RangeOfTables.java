package com.controlStatements;

import java.util.Scanner;

public class RangeOfTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int x= sc.nextInt();
		
		for(int n = 1 ; n <=x;n++) {
		for(int i = 1 ; i<=10;i++) {
			System.out.println(n + "*" +i+"="+(n*i));
		}
		System.out.println("---------");
		}
		sc.close();
	}

}
