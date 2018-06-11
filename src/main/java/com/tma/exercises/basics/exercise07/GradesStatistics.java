package com.tma.exercises.basics.exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
	public static int[] grades; // Declare an int[], to be allocated later.
								// This array is accessible by all the methods.

	public static void main(String[] args) {
		readGrades(); // Read and save the inputs in int[] grades
		printArray(grades);
		System.out.println("The average is " + average(grades));
		System.out.println("The median is " + median(grades));
		System.out.println("The minimum is " + min(grades));
		System.out.println("The maximum is " + max(grades));
		System.out.println("The standard deviation is " + stdDev(grades));
	}

	// Prompt user for the number of students and allocate the global "grades"
	// array.
	// Then, prompt user for grade, check for valid grade, and store in "grades".
	public static void readGrades() {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		System.out.print("Enter the number of students: ");
		size = sc.nextInt();
		grades = new int[size];

		if (size > 0)
			for (int i = 0; i < grades.length; i++) {
				System.out.print("Enter the grade for student " + (i+1) + ": ");
				grades[i] = sc.nextInt();
			}

	}

	// Print the given int array in the form of {x1, x2, x3,..., xn}.
	public static void printArray(int[] array) {
		System.out.print("{" + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println("}");
	}

	// Return the average value of the given int[]
	public static double average(int[] array) {
		int sum = 0;
		for (int arr : array) {
			sum += arr;
		}
		return (double) sum / array.length;
	}

	// Return the median value of the given int[]
	// Median is the center element for odd-number array,
	// or average of the two center elements for even-number array.
	// Use Arrays.sort(anArray) to sort anArray in place.
	public static double median(int[] array) { 
		Arrays.sort(array);
		if(array.length % 2 != 0)
			return array[array.length / 2 + 1];
		return (double)(array[array.length / 2] + array[array.length / 2 + 1])/2;
	}

	// Return the maximum value of the given int[]
	public static int max(int[] array) {
		int max = array[0]; // Assume that max is the first element
		// From second element, if the element is more than max, set the max to this
		// element.
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	// Return the minimum value of the given int[]
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	// Return the standard deviation of the given int[]
	public static double stdDev(int[] array) { 
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i]*array[i] - average(array)*average(array);
		}
		return Math.sqrt((1.0/array.length) * sum);
	}
}