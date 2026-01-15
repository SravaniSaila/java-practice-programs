package com.Conditional;
import java.util.Scanner;

public class SwitchExample7 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Day:");
		String day=obj.nextLine().toUpperCase();
		
		String result = "";
		switch(day) {
			case "SUN DAY", "SATUR DAY" -> result="Wake up at 10 AM";
				
			case "MON DAY", "TUES DAY", "WEDNES DAY", "THURS DAY", "FRI DAY" -> result="Wake up at 8 AM";
				
			default -> result="Hello Sailaja please enter valid day";
		}
		System.out.println(result.toUpperCase());
	    obj.close();
	}
}