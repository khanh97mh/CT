package com.tma.exercises.basics.exercise02;

public class SumAndAverage {
	public static void SumAndAverage(int lowerbound, int upperbound) {
		System.out.println("---------------");
		System.out.println("The lowerbound number is: " + lowerbound + " upperbound number is: " + upperbound);
		System.out.println("Using for loop");
		int sum = 0;
		double average = 0;
		int i = 0;
		int count = upperbound - lowerbound + 1;

		for (i = lowerbound; i <= upperbound; i++) {
			sum += i;
		}
		average = (double) sum / count;

		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + average);

		sum = 0;
		average = 0;
		i = lowerbound;
		System.out.println("Using while loop");
		
		while(i <= upperbound) {
			sum += i;
			i++;
		}
		average = (double) sum / count;
		
		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + average);
		
		sum = 0;
		average = 0;
		i = lowerbound;
		System.out.println("Using do-while loop");
		
		do {
			sum += i;
			i++;
		} while (i <= upperbound);
		average = (double) sum / count;
		
		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + average);
		
	}
	public static void SumAndAverageOfOddNumber(int lowerbound, int upperbound) {
		System.out.println("---------------");
		System.out.println("The lowerbound number is: " + lowerbound + " upperbound number is: " + upperbound);
		System.out.println("The sum and the average of odd numbers");
		int sum = 0;
		double average = 0;
		int i = 0;
		int count = 0;

		for (i = lowerbound; i <= upperbound; i++) {
			if(i % 2 != 0) {
				sum += i;
				count++;
			}
		}
		average = (double) sum / count;

		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + average);		
	}
	public static void SumAndAverageOfDivisibleBy7(int lowerbound, int upperbound) {
		System.out.println("---------------");
		System.out.println("The lowerbound number is: " + lowerbound + " upperbound number is: " + upperbound);
		System.out.println("The sum and the average divisible by 7");
		int sum = 0;
		double average = 0;
		int i = 0;
		int count = 0;

		for (i = lowerbound; i <= upperbound; i++) {
			if(i % 7 == 0) {
				sum += i;
				count++;
			}
		}
		average = (double) sum / count;

		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + average);		
	}
	public static void SumAndAverageOfSquares(int lowerbound, int upperbound) {
		System.out.println("---------------");
		System.out.println("The lowerbound number is: " + lowerbound + " upperbound number is: " + upperbound);
		System.out.println("The sum of the squares and the average");
		int sum = 0;
		double average = 0;
		int i = 0;
		int count = 0;

		for (i = lowerbound; i <= upperbound; i++) {
				sum += i*i;
				count++;
		}
		average = (double) sum / count;

		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + average);		
	}
}
