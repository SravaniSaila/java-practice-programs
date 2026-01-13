package com.version2;

public class Test {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		//call the static variable using class
		Employee.company="Codegnan IT Solutions";
		
		obj1.id=101;
		obj1.name="sravani";
		obj1.salary=45000.00;
		
		obj2.id=102;
		obj2.name="sailaja";
		obj2.salary=50000.00;
		
		
		
		obj1.getDetails();
		obj2.getDetails();
		

	}

}
