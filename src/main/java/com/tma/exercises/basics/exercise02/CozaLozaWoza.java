package com.tma.exercises.basics.exercise02;

public class CozaLozaWoza {
	public static void CozaLozaWoza() {
		System.out.println("---------------");
		int lowerbound = 1, upperbound = 110;
		for (int number = lowerbound; number <= upperbound; ++number) {
			if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
				System.out.print(number);
			}
			if (number % 3 == 0) {
				System.out.print("Coza");
			}
			if (number % 5 == 0) {
				System.out.print("Loza");
			}
			if (number % 7 == 0) {
				System.out.print("Woza");
			}

			if (number % 11 == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
	}
}
