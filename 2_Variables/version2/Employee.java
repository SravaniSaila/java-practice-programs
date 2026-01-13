package com.version2;

public class Employee {
	
	int id; //instance variable
	String name; //instance variable
	double salary; //instance variable
	
	//static variables - these binds with the class not object
	//declared inside the class outside the method
	//memory is allocated to instance variables before the object is created
	static String company;
	
	
	public void getDetails() {
		System.out.println(id + " " + name + " " + salary+" "+ company);
	
	}

}
