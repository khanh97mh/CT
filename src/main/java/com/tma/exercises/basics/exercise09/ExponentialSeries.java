package com.tma.exercises.basics.exercise09;

public class ExponentialSeries {
	public static void main(String[] args) {
		System.out.println(exp(5, 20));
	}
	public static double exp(int numTerms) {
		double sum = 0;
				for (int i = 0; i <= numTerms; i++) {
					sum += 1.0 / Giaithua(i);
				}
		return sum;
	}
	public static double exp(double x, int numTerms) {
		double sum = 0;
		for (int i = 0; i <= numTerms; i++) {
			sum += Math.pow(x, i) / Giaithua(i);
		}
return sum;
	}
	public static double Giaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }


}
