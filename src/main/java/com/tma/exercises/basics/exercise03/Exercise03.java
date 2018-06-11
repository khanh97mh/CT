package com.tma.exercises.basics.exercise03;

public class Exercise03 {
	public static void main(String[] args) {  // Set an initital breakpoint at this statement
	      int n = 20;
	      int factorial = 1;
	      // n! = 1*2*3...*n
	      System.out.println(" n |    factorial");
	      for (int i = 1; i <= n; i++) {
	         factorial = factorial * i;
	         System.out.printf("\n%2d | %12d", i, factorial);
	      }
	      System.out.println("\nThe Factorial of " + n + " is " + factorial);
	   }
}
