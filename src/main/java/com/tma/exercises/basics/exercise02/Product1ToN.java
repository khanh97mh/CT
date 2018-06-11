package com.tma.exercises.basics.exercise02;

public class Product1ToN {

	public static void Product1ToN(int start, int end) {
		System.out.println("---------------");

		long product = 1;

		for (int i = start; i <= end; i++) {
//			System.out.print(i);
//			if(i != end) {
//				System.out.print("x");
//			}
			product *= i;
		}
//			System.out.println();

		System.out.println("The product of integers " + start + " to " + end + " is: " + product);
	}
}
