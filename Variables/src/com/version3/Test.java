package com.version3;

public class Test {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		
		obj1.id=101;
		obj1.name="sravani";
		obj1.salary= 45000.00;
		
		obj2.id=102;
		obj2.name="sailaja";
		obj2.salary=50000.00;
		//obj2.company="new Company"; //can't be modified 
		
		
		
		obj1.getDetails();
		obj2.getDetails();
		

	}

}
