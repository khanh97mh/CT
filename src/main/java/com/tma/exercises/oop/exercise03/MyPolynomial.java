package com.tma.exercises.oop.exercise03;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) { // varargs
		this.coeffs = coeffs; // varargs is treated as array
	}
	// public MyPolynomial(double[] coeffs) {
	// this.coeffs = coeffs;
	// }

	public int getDegree() {
		return coeffs.length - 1;
	}

	public String toString() {
		String X = "X";
		String polynomial = "(" + coeffs[getDegree()] + ")X^" + getDegree();
		for (int i = getDegree() - 1; i >= 0; i--) {
			polynomial += " + (" + coeffs[coeffs.length - i - 1] + ")" + X + "^" + i;
		}
		return polynomial;
	}

	public double evaluate(double x) {
		double sum = 0;
		for (int i = getDegree(); i >= 0; i--) {
			sum += coeffs[coeffs.length - i - 1]* Math.pow(x, i);
		}
		return sum;
	}

	public MyPolynomial add(MyPolynomial right) {
		//Chưa làm
		return this;
	}

	public MyPolynomial multiply(MyPolynomial right) {
		//Chưa làm
		return this;
	}

	
}
