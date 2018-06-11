package com.tma.exercises.basics.exercise09;

public class SpecialSeries {
	public static void main(String[] args) {
		double x = 0.5;
		int numTerms = 10;
		System.out.println("The sum of the series with x = " + x + " is: " + sumOfSeries(x, numTerms));

	}

	public static double sumOfSeries(double x, int numTerms) {
		double sum = x;
		double mul1 = 1;
		double mul2 = 1;
		for (int i = 3; i <= numTerms; i = i + 2) {
			for (int j = 1; j < i; j++) {
				if (j % 2 != 0) {
					mul1 *= j;
				} else {
					mul2 *= j;
				}
			}
			sum += (mul1 / mul2) * (Math.pow(x, i) / i);
			mul1 = mul2 = 1;
		}
		return sum;
	}

	
}
