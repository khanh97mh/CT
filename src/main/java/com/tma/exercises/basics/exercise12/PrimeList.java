package com.tma.exercises.basics.exercise12;

public class PrimeList {

	public static void main(String[] args) {
		int upperBound = 10000;		
		int count = 0;
		System.out.println("Enter the upper bound: " + upperBound);
		for (int i = 1; i < upperBound; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("[" + count + " primes found (" + (double)count/upperBound * 100 + "%)]");
		
		
	}

	public static boolean isPrime(int posInt) {
		//if(posInt < 2) return false;
		for (int i = 2; i <= Math.sqrt(posInt); i++) {
			if(posInt % i == 0)
				return false;
		}
		return true;
	}
}
