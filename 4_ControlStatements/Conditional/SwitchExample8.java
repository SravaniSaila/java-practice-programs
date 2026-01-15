package com.Conditional;

import java.util.Scanner;

public class SwitchExample8 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Day:");
		String day=obj.nextLine().toUpperCase();
		
		String result = "";
		result=switch(day) {
			case "SUN DAY", "SATUR DAY": yield "Wake up at 10 AM";
				
			case "MON DAY", "TUES DAY", "WEDNES DAY", "THURS DAY", "FRI DAY" : yield "Wake up at 8 AM";
				
			default : yield "Hello Sailaja please enter valid day"+day;
		};
		System.out.println(result.toUpperCase());
	    obj.close();
	}
}