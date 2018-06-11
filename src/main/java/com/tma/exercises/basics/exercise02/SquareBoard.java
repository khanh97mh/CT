package com.tma.exercises.basics.exercise02;

public class SquareBoard {
	public static void SquareBoard(int size) {
		System.out.println("---------------");
		if(size > 0) {
			for (int row = 0; row < size; row++) {
				for (int column = 0; column < size; column++) {
					System.out.print("$ ");
				}
				System.out.println();
			}
		}
	}
}

