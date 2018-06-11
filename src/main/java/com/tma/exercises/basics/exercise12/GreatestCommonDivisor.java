package com.tma.exercises.basics.exercise12;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println("GCD(15, 5) = " + gcd(15, 5));
	}

	public static int gcd(int a, int b) {
		while (b != 0) {			   
			   int temp = b;
			   b = a % b;
			   a = temp;
			}
		return a;
	}
	public static int gcdRecursive(int a, int b) {
		return b == 0 ? a : gcdRecursive(b, a % b);
	}
}
