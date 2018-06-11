package com.tma.exercises.oop.exercise03;

public class TestMyPolynomial {
	public static void main(String[] agrs) {
		file p1 = new file(1, 2);
	    // Can also invoke with an array
	    double[] coeffs = {1,2,3,4};
	    file p2 = new file(coeffs);

		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("Degree of p1: " + p1.getDegree());

		System.out.println("Degree of p2: " + p2.getDegree());
		System.out.println("Solve P1 with X = 2, P1(2) =  " + p1.evaluate(2));
		
		System.out.println("Multi P1 * P2 = " + ( p1).multiply(p2));
		System.out.println("Add P1 + P2 = " + p1.add(p2));
//		p1: 2.0x + 1.0
//		p2: 4.0x^3 + 3.0x^2 + 2.0x + 1.0
//		Degree of p1: 1
//		Degree of p2: 3
//		Solve P1 with X = 2, P1(2) =  5.0
//		Multi P1 * P2 = 8.0x^4 + 10.0x^3 + 7.0x^2 + 4.0x + 1.0
//		Add P1 + P2 = 8.0x^4 + 14.0x^3 + 10.0x^2 + 6.0x + 2.0
	}

}
