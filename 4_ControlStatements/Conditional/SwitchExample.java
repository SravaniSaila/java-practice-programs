package com.Conditional;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
		
		System.out.println("Please eneter you choice");
		String choice = obj.next();
		
		
		switch(choice) {
		case "PFS":
			System.out.println("100 days");
			System.out.println("Fee:30000");
			
		break;
	    case "JFS":
	    	System.out.println("100 days");
	    	System.out.println("Fee:30000");
	    break;
	    case "	DSA":
	    	System.out.println("100 days");
	    	System.out.println("Fee:30000");
	    break;
	    default:
	    	System.out.println("100 days");
	    	System.out.println("Fee:30000");
	    break;
	}		
		obj.close();	}

}