package com.tma.exercises.basics.exercise02;

public class TimeTable {
	public static void TimeTable(int n) {
		System.out.println("---------------");
		for (int row = 0; row < n + 2; row++) {
			for (int column = 0; column < n + 2; column++) {
				if (row == 0 && column == 0) {
					System.out.print("   * ");
				}
				if (row == 0 && column > 1) {
					System.out.printf("%4d ", column - 1);
				}
				if (column == 1 && row != 1) {
					System.out.print("| ");
				}
				if (row > 1 && column == 0) {
					System.out.printf("%4d ", row - 1);
				}
				if (column != 1 && row == 1) {
					System.out.print("-----");
				}
				if (row > 1 && column > 1) {
					System.out.printf("%4d ", (column - 1) * (row - 1));
				}

			}
			System.out.println();
		}
		
		
	}
}
