package com.Conditional;

import java.util.Scanner;

public class SwitchExample6 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Day");
		String day = obj.nextLine().toUpperCase();
		String result ="";
		
		result = switch(day) {
		case "SUN DAY", "SATUR DAY" -> "Wake up at 10AM";
			
		case "MON DAY","TUES DAY","WEDNES DAY","THURS DAY","FRI DAY" -> "Wake up at 10AM";
			
		default ->"Hello sravani please enetr valid day";
			
		};
		System.out.println(result.toUpperCase());
		
		obj.close();
	}

}