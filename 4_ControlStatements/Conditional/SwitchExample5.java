package com.Conditional;

import java.util.Scanner;

public class SwitchExample5 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Day");
		String day = obj.nextLine().toUpperCase();
		
		switch(day) {
		case "SUN DAY", "SATUR DAY":
			System.out.println("Wake up at 10AM");
			break;
		case "MON DAY","TUES DAY","WEDNES DAY","THURS DAY","FRI DAY":
			System.out.println("Wake up at 10AM");
			break;
		default:
			System.out.println("Hello sravani please enetr valid day");
			
		}
		obj.close();

	}

}