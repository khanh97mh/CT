package com.tma.exercises.basics.exercise10;

public class New {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(n + "! = " + factorial(n));
		System.out.println("Fibonacci(" + n + ") is " + Fibonacci(n));
		ARunningNumberSequence(11);
		System.out.println("gcd(15,3) is " + gcd(15, 3));
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int Fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return Fibonacci(n - 1) + Fibonacci(n - 1);

	}

	public static void ARunningNumberSequence(int n) {
		NumberSequence(1, "", n);
	}

	public static void NumberSequence(int n, String str, int stop) {
		if (n > stop)
			return;
		str += n + "";
		System.out.println("S(" + n + ") = " + str);
		NumberSequence(n + 1, str, stop);
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
