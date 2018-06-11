package com.tma.exercises.basics.exercise02;

public class ExtractDigits {
	public static void ExtractDigits(int n) {
		System.out.println("---------------");
		System.out.println("The number is " + n);
		while(n > 0) {
			int digit = n % 10;
			System.out.print(digit + " ");
			n /= 10;
		}
	}
}
