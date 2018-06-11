package com.tma.exercises.basics.exercise09;

public class TribonacciInt {
	public static void main(String[] args) {
		Tribonacci(45);
	}

	public static void Tribonacci(int n) {
		int f1 = 0;
		int f2 = 0;
		int f3 = 1;
		int f = 0;
		boolean check = false;
		System.out.println("F(0) = " + f1);
		System.out.println("F(1) = " + f2);
		System.out.println("F(2) = " + f3);
		for (int i = 3; i <= n; i++) {
			f = f1 + f2 + f3;
			if (Integer.MAX_VALUE - f1 - f2 < f3)
				check = true;
			if (!check) {
				System.out.println("F(" + i + ") = " + f);
			} else {
				System.out.println("F(" + i + ") is out of the range of int");
			}
			f1 = f2;
			f2 = f3;
			f3 = f;
		}
	}
}
