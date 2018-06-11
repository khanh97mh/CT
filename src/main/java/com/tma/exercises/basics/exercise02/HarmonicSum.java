package com.tma.exercises.basics.exercise02;

public class HarmonicSum {
	public static void HarmonicSum(int maxDenominator) {
		System.out.println("---------------");
		 // Use a more meaningful name instead of n
		double sumL2R = 0.0; // sum from left-to-right
		double sumR2L = 0.0; // sum from right-to-left

		// for-loop for summing from left-to-right
		for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
			sumL2R += (1.0 / denominator);
		}
		System.out.println("The sum from left-to-right is: " + sumL2R);

		// for-loop for summing from right-to-left
		for (int denominator = maxDenominator; denominator >= 1; denominator--) {
			sumR2L += (1.0 / denominator);
		}
		System.out.println("The sum from right-to-left is: " + sumR2L);

		// Find the difference and display
	}
}
