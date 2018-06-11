package com.tma.exercises.basics.exercise09;

public class PrintPatterns {
	public static void main(String[] args) {
		printPatternX(11);
	}

	public static void printPatternX(int size) {
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				if (j < i)
					System.out.print("  ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
		for (int i = size; i > 0; i--) {
			for (int j = 0; j <= size - i/2; j++) {
				if(i % 2!=0)
				if(j > i/2)
					System.out.print("# ");
				else
					System.out.print("  ");
				
			}if(i % 2!=0)
			System.out.println();
		}
		System.out.println();
		//*****************************************
		
		for (int i = size; i > 1; i--) {
			for (int j = 0; j < size - i/2; j++) {
				if(i % 2!=0)
				if(j >= i/2)
					System.out.print("# ");
				else
					System.out.print("  ");
				
			}if(i % 2!=0)
			System.out.println();
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				if (j < i)
					System.out.print("  ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
		
		//******************************************
		size = 8;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print((j+ 1) + " ");
			}
			System.out.println();
		}
		System.out.println();
		int k = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(j < i) {
					System.out.print("  ");
				} else {
				System.out.printf("%d ", k++);
				}
			}
			k = 1;
			System.out.println();
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print((j+ 1) + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
