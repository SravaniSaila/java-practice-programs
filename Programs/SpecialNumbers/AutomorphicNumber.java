package com.specialNumbers;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int temp = n;
        int square = n * n;

        int noOfDigits = 0;
        int copy = n;

        
        while (copy > 0) {
            noOfDigits++;
            copy /= 10;
        }

        int value = 1;
        for (int i = 1; i <= noOfDigits; i++) {
            value = value * 10;
        }

        if (square % value == temp) {
            System.out.println(temp + " is an Automorphic number");
        } else {
            System.out.println(temp + " is NOT an Automorphic number");
        }

        sc.close();
    }
}

