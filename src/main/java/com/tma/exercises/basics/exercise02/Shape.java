package com.tma.exercises.basics.exercise02;

public class Shape {
	public static void Shape(){
		System.out.println("---------------");
		
		int size = 8;
		int row;
		int column;
		for(row = 1; row <= size; row++) {
			for(column = 1; column < row + 1; column++) {
				System.out.print("$ ");
			}
			System.out.println();
		}		
		System.out.println("      (a)");
		
		for(row = size; row >= 1; row--) {
			for(column = 1; column <= row; column++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println("      (b)");
		
		for(row = 1; row <= size; row++) {
				for(column = 1; column <= size; column++) {
					if(column < row) {
						System.out.print("  ");
					} else {
						System.out.print("$ ");
					}
				}
				System.out.println();
		}		
		System.out.println("      (c)");
		
		for (row = size; row >= 1; row--) {
			for (column = 1; column <= size; column++) {
				if (column < row) {
					System.out.print("  ");
				} else {
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
		System.out.println("      (d)");
		
		for (row = 1; row <= size; row++) {
			for (column = 1; column <= size; column++) {
				if(row == 1 || row == size || column == 1 || column == size) {
					System.out.print("$ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("      (e)");
		
		for (row = 1; row <= size; row++) {
			for (column = 1; column <= size; column++) {
				if(row == 1 || row == size || row == column) {
					System.out.print("$ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("      (f)");
		
		for (row = 1; row <= size; row++) {
			for (column = 1; column <= size; column++) {
				if(row == 1 || row == size || row + column == size + 1) {
					System.out.print("$ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("      (g)");
		
		for (row = 1; row <= size; row++) {
			for (column = 1; column <= size; column++) {
				if(row == 1 || row == size || (row + column == size + 1 || row == column)) {
					System.out.print("$ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("      (h)");
		
		for (row = 1; row <= size; row++) {
			for (column = 1; column <= size; column++) {
				if(row == 1 || row == size|| column == 1 || column == size || (row + column == size + 1 || row == column)) {
					System.out.print("$ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("      (i)");
	}
}
