package com.tma.exercises.basics.exercise07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradesHistogram {

	private int[] grades = { 49, 50, 51, 59, 0, 5, 9, 10, 15, 19, 50, 55, 89, 99, 100 };
	private int[] bins = new int[10];

	public static void main(String[] args) {
		GradesHistogram aGradesHistogram = new GradesHistogram();
		// aGradesHistogram.printGrades();
		aGradesHistogram.computeHistogram();
		// aGradesHistogram.printBins();
		aGradesHistogram.printHistogramHorizontal();
		aGradesHistogram.printHistogramVertical();
	}

	// check grade value
	private boolean isGradeValid(int grade) {
		return (0 <= grade && grade <= 100);
	}

	/**
	 * Read the grades from "filename", store in "grades" array. Assume that the
	 * inputs are valid.
	 */

	/**
	 * Based on "grades" array, populate the "bins" array.
	 */
	private void computeHistogram() {
		for (int i = 0; i < grades.length; i++) {
			int j = (grades[i] == 100) ? 9 : grades[i] / 10;
			bins[j] += 1;
		}
	}

	/**
	 * Print histogram based on the "bins" array.
	 */
	private void printHistogramHorizontal() {
		System.out.println();
		for (int i = 0; i < bins.length; i++) {
			int delta = (i == bins.length - 1) ? 10 : 9;
			System.out.printf("%2d -%3d:", (i * 10), (i * 10 + delta));
			for (int j = 0; j < bins[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Print histogram based on the "bins" array.
	 */
	private void printHistogramVertical() {
		// find out number of rows to output histogram
		int maxBin = bins[0];
		for (int i = 0; i < bins.length; i++) {
			maxBin = (bins[i] > maxBin) ? bins[i] : maxBin;
		}

		// print histogram
		System.out.println();
		for (int i = maxBin; i >= 0; i--) {
			if (i == 0) {
				for (int j = 0; j < bins.length; j++) {
					int delta = (j == bins.length - 1) ? 10 : 9;
					System.out.printf("%2d-%-2d ", (j * 10), (j * 10 + delta));
				}
			} else {
				for (int j = 0; j < bins.length; j++) {
					String str = (bins[j] < i) ? " " : "*";
					System.out.printf("%3s%-2s ", str, " ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * Print students' grades
	 */
	private void printGrades() {
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Print students' grades
	 */
	private void printBins() {
		for (int i = 0; i < bins.length; i++) {
			System.out.print(bins[i] + " ");
		}
		System.out.println();
	}
}
