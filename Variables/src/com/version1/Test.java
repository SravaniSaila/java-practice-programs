package com.version1;

public class Test {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		
		obj1.id = 101;
		obj1.name = "sravani";
		obj1.salary =40000.00;
		obj1.company= "CodeGnan IT Solutions";
		
		obj2.id= 102;
		obj2.name="sailaja";
		obj2.salary=45000.00;
		obj2.company = "CodeGnan IT Solutions";
		
		obj1.getDetails();
		obj2.getDetails();
		obj3.getDetails(); //default values will be allocated
		
		
		

	}

}
