package com.Conditional;

import java.util.Scanner;

public class SwitchExample4 {

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
		case "MON DAY":
			System.out.println("Wake up at 10AM");
			break;
		case "TUE DAY":
			System.out.println("Wake up at 10AM");
			break;
		case "WED DAY":
			System.out.println("Wake up at 10AM");
			break;
		case "THURS DAY":
			System.out.println("Wake up at 10AM");
			break;
		case "FRI DAY":
			System.out.println("Wake up at 10AM");
			break;
		default:
			System.out.println("Hello manikanta please enetr valid day");
			
		}
		obj.close();

	}

}