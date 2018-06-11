package com.tma.exercises.basics.exercise09;

public class Factorial1to10 {
	public static void main(String[] args) {
		System.out.println("Factorial1to10");
		Factorial();
		System.out.println("\nFactorialInt");
		FactorialInt(25);
		System.out.println("\nFactorialLong");
		FactorialLong(25);
	}

	public static void Factorial() {
		int mul = 1;
		for (int i = 1; i <= 10; i++) {
			mul *= i;
			System.out.println("The factorial of " + i + " is " + mul);
		}
	}

	public static void FactorialLong(int n) {
		long mul = 1;
		boolean check = false;
		for (int i = 1; i <= n; i++) {
			mul *= (long)i;
			if (!check)
				System.out.println("The factorial of " + i + " is " + mul);
			else
				System.out.println("The factorial of " + i + " is out of range");
			if (Long.MAX_VALUE / mul < n + 1)
				check = true;
		}
	}
	
	public static void FactorialInt(int n) {
		int mul = 1;
		boolean check = false;
		for (int i = 1; i <= n; i++) {
			mul *= i;
			if (!check)
				System.out.println("The factorial of " + i + " is " + mul);
			else
				System.out.println("The factorial of " + i + " is out of range");
			if (Integer.MAX_VALUE / mul < n -1)
				check = true;
		}
	}
}
