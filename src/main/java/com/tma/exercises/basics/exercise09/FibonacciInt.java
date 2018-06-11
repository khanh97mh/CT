package com.tma.exercises.basics.exercise09;

public class FibonacciInt {
	public static void main(String[] args) {
		Fibonacci(56);
	}

	public static void Fibonacci(int n) {
		int f1 = 0;
		int f2 = 1;
		int f = 0;
		boolean check = false;
		System.out.println("F(0) = " + f2);
		for (int i = 0; i < n; i++) {
			f = f1 + f2;
			if (Integer.MAX_VALUE - f1 <= f2) {
				check = true;
			}
			if (check) {
				System.out.println("F(" + (i + 1) + ") is out of the range of int");
			} else {
				System.out.println("F(" + (i + 1) + ") = " + f);
			}
			f1 = f2;
			f2 = f;
		}
	}
}
