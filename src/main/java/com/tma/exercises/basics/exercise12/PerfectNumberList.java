package com.tma.exercises.basics.exercise12;

public class PerfectNumberList {
	public static void main(String[] args) {
		int upperBound = 1000;
		int countPerfect = 0;
		int countDeficient = 0;
		System.out.println("Enter the upper bound: " + upperBound);
		System.out.println("These numbers are perfect:");
		for (int i = 1; i <= upperBound; i++) {
			if(isPerfect(i)) {
				System.out.print(i + " ");
				countPerfect++;
			}
		}
		System.out.println();
		System.out.println("[" + countPerfect + " perfect numbers found (" + (double)countPerfect/upperBound * 100 + "%)]");
		
		System.out.println("\nThese numbers are neither deficient nor perfect:");
		for (int i = 1; i <= upperBound; i++) {
			if(!isDeficient(i) && !isPerfect(i)) {
				System.out.print(i + " ");
				countDeficient++;
			}
		}
		System.out.println();
		
		System.out.println("[" + countPerfect + " perfect numbers found (" + (double)countDeficient/upperBound * 100 + "%)]");
	}

	public static boolean isPerfect(int posInt) {
		int sumDivisor = 0;
		for (int i = 1; i < posInt; i++) {
			if (posInt % i == 0) {
				sumDivisor += i;
			}
		}
		if (sumDivisor == posInt)
			return true;
		return false;
	}

	public static boolean isDeficient(int posInt) {
		int sumDivisor = 0;
		for (int i = 1; i < posInt; i++) {
			if (posInt % i == 0) {
				sumDivisor += i;
			}
		}
		if (sumDivisor < posInt)
			return true;
		return false;
	}
}
