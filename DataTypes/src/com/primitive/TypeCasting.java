package com.primitive;

public class TypeCasting {

	public static void main(String[] args) {
		//Implicit Type Conversion
		int a = 100; //4bytes Source(smaller)
		long b = a; //8 bytes Destination(larger)
		
		
		//Explicit Type Conversion(Type Casting)
		double d = 453.5969; //8 bytes(larger)
		float f = (float)d; //4 bytes (smaller)
		
		System.out.println(b);
		System.out.println(f);
		
		double c = 23.76778;
		int e = (int)c;
		System.out.println(e);
	}

}





