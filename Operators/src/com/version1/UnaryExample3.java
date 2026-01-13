package com.version1;

public class UnaryExample3 {
	public static void main(String[] args) {
		int x = 50; 
		int y = 50;
		
		int result = x++ + --y + x-- + ++x - ++y - y++ + x++ + y++ + --x + --y;
		
		System.out.println(result);
		
	}

}
