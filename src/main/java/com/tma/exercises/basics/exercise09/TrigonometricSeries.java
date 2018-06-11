package com.tma.exercises.basics.exercise09;

public class TrigonometricSeries {

	public static void main(String[] args) {
		double x = Math.PI / 6;
		int numTerms = 10;

		TrigonometricSeries aTrigonometricSeries = new TrigonometricSeries();

		System.out.println("Calculated values:");
		System.out.printf("sin(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI), aTrigonometricSeries.sin(x, numTerms));
		System.out.printf("cos(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI), aTrigonometricSeries.cos(x, numTerms));

		System.out.println("java.lang.Math values:");
		System.out.printf("sin(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI), Math.sin(x));
		System.out.printf("cos(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI), Math.cos(x));
	}

	private double calculateTerm(double x, int numTerms) {
		double term = 1D;
		for (int i = numTerms; i > 0; i--) {
			term *= x / i;
		}
		return term;
	}

	private double sin(double x, int numTerms) {
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, (2 * i + 1));
		}
		return result;
	}

	private double cos(double x, int numTerms) {
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, 2 * i);
		}
		return result;
	}

}
/*
 * public class TrigonometricSeries { public static void main(String[] args) {
 * System.out.println("Sin(30) = " + sin(30,20));
 * System.out.println("Sin(30) = " + Math.sin(30));
 * 
 * System.out.println("Cos(30) = " + cos(30,20));
 * System.out.println("Cos(30) = " + Math.cos(30));
 * 
 * } public static double sin(double x, int numTerms) { double sum = 0; int dau
 * = 1; for(int i = 1; i < numTerms; i = i + 2) { sum += dau*(Math.pow(x, i) /
 * factorial(i)); if(dau == 1) dau = -1; else dau = 1; } return sum; } public
 * static double cos(double x, int numTerms) { double sum = 0; int dau = 1;
 * for(int i = 0; i < numTerms; i = i + 2) { sum += dau*(Math.pow(x, i) /
 * factorial(i)); if(dau == 1) dau = -1; else dau = 1; } return sum; } public
 * static int factorial (int num) { int tmp = 1; if(num < 1) return tmp; for(int
 * i = 2; i <= num; i++) tmp *= i; return tmp; } }
 */
