package com.tma.exercises.basics.exercise12;

public class PerfectPrimeFactorList {
	public static void main(String[] args) {
		int upperBound = 100;		
		int count = 0;
		System.out.println("Enter the upper bound: " + upperBound);
		System.out.println("These numbers are equal to the product of prime factors: ");
		for(int i = 1; i < upperBound; i++) {
			if(isProductOfPrimeFactors(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n[" + count + " primes found (" + (double)count/upperBound * 100 + "%)]");
	}

	public static boolean isProductOfPrimeFactors(int posInt) {
//		int mul = 1;
//		for (int i = 1; i < posInt; i++) {
//			if (isPrime(i)) {
//				mul *= i;
//			}
//		}
//		if (mul == posInt)
//			return true;
//		return false;
		int prod = 1;
        for (int i = 2; i < posInt; i++) {
            prod *= isPrime(i) && (posInt%i == 0) ? i : 1;
        }
        return (prod == posInt);
	}

	public static boolean isPrime(int posInt) {
		for (int i = 2; i <= Math.sqrt(posInt); i++) {
			if (posInt % i == 0)
				return false;
		}
		return true;
	}
}
