package com.tma.exercises.basics.exercise06;

import java.util.Scanner;

public class GradesAverage {
	public static void GradesAverage() {
		Scanner sc = new Scanner(System.in);
		int numStudents;
		int[] averages;
		int sum = 0;

		System.out.print("Enter the number of students: ");
		numStudents = sc.nextInt();
		averages = new int[numStudents];
		
		for (int i = 0; i < numStudents; i++) {
			do {
				System.out.print("Enter the grade for student " + (i+1) + ": ");
				averages[i] = sc.nextInt();
				if (averages[i] < 0 || averages[i] > 100)
					System.out.println("Invalid grade, try again...");
			} while (averages[i] < 0 || averages[i] > 100);
		}
		for (int i = 0; i < averages.length; i++) {
			sum += averages[i];
		}
		System.out.printf("The average is: %.1f", (double) sum / averages.length);
	}
}
