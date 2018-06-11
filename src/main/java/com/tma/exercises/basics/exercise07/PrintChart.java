package com.tma.exercises.basics.exercise07;

import java.util.Scanner;

public class PrintChart {
	public static int[] bars;

	public static void main(String[] args) {
		readInput();
		printChart();
	}

	public static void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of bars: ");
		int size = sc.nextInt();
		bars = new int[size];
		for (int i = 0; i < bars.length; i++) {
			System.out.print("Enter bar " + (i + 1) + " value: ");
			bars[i] = sc.nextInt();
		}
	}

	public static void printChart() {
		for (int i = 0; i < bars.length; i++) {
			for (int j = 0; j < bars[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" (" + bars[i] + ")");
		}
	}
}
