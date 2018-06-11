package com.tma.exercises.basics.exercise02;

public class Fibonacci {
	public static void Fibonacci(int n) {
		System.out.println("---------------");
		System.out.println("The first " + n + " Fibonacci numbers are:");
		int f1 = 0;
		int f2 = 1;
		int f = f2;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(f + " ");
			sum += f;
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			count++;
		}
		System.out.println("\nThe average is: " + (double)sum/count);
	}
}
