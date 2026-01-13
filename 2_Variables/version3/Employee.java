package com.version3;

public class Employee {
	
	int id; //instance variable
	String name; //instance variable
	double salary; //instance variable
	
	final static String company="Codegnan IT Solutions"; //final static variable
	
	
	public void getDetails() {
		System.out.println(id + " " + name + " " + salary+" "+ company);
	
	}

}

