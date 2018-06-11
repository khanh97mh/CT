package com.tma.exercises.basics.exercise02;

public class ComputePI {
	public static void ComputePI(int maxDenominator) {
		System.out.println("---------------");
		double sum = 0.0;
		for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {  // 1, 3, 5, 7,...
			   if (denominator % 4 == 1) {
			      sum += 1.0/denominator;
			   } else if (denominator % 4 == 3) {
			      sum -= 1.0/denominator;
			   } else {   // remainder of 0 or 2
			      System.out.println("The computer has gone crazy?!");
			   }
			}
		
//		int maxTerm = maxDenominator;
//		for (int term = 1; term <= maxTerm; term++) {  
//			   if (term % 2 == 1) {  // 
//			      sum += 1.0/(term*2-1);
//			   } else {              
//				   sum -= 1.0/(term*2-1);
//			   }
//			}
		System.out.println("the value of pi = " + 4*sum);
		System.out.println("the value of π in a double constant called Math.PI = " + Math.PI);
	}
}
