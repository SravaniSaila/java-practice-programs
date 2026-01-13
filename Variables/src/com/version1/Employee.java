package com.version1;

public class Employee {
	//instance variables - these binds with the object
	//every object has separate copy of the instance variables
	//declared inside the class outside the method
	//memory is allocates to instance variables only when the object is created
	//int default value 0 , String default value null, 
	int id;
	String name;
	double salary;
	String company;
	
	//k
	public void getDetails() {
		System.out.println(id + " " + name + " " + salary+" "+ company);
	
	}

}
