package com.Conditional;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Day");
		String day = obj.nextLine();
		
		switch(day) {
		case "SUN DAY":
			System.out.println("Wake up at 10AM");
			break;
		case "SATUR DAY":
			System.out.println("Wake up at 10AM");
			break;
		default:
			System.out.println("Wake up at 4 am");
			break;
		}
		obj.close();

	}

}