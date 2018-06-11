package com.tma.exercises.basics.exercise09;

public class Matrix {
	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 5 } };
		double[][] mD = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printMatrix(m);
		// printMatrix(mD);
		System.out.println(haveSameDimension(m, m2));
		int[][] add = add(m, m);
		printMatrix(add(mD, mD));
	}

	public static void printMatrix(int[][] m) {
		for (int[] row : m) {
			for (int col : row) {
				System.out.printf("%3d ", col);
			}
			System.out.println();
		}
	}

	public static void printMatrix(double[][] mD) {
		for (double[] row : mD) {
			for (double col : row) {
				System.out.printf("%5.1f ", col);
			}
			System.out.println();
		}
	}

	public static boolean haveSameDimension(int[][] m1, int[][] m2) {
		if (m1.length != m2.length)
			return false;
		for (int i = 0; i < m1.length; i++) {
			if (m1[i] != m2[i])
				return false;
		}
		return true;
	}

	public static boolean haveSameDimension(double[][] m1, double[][] m2) {
		if (m1.length != m2.length)
			return false;
		for (int i = 0; i < m1.length; i++) {
			if (m1[i] != m2[i])
				return false;
		}
		return true;
	}

	public static int[][] add(int[][] m1, int[][] m2) {
		int[][] add = new int[m1.length][m1.length];
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add.length; j++) {
				add[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return add;
		// int[][] result = new int[m1.length][];
		// for(int i = 0; i < result.length; i++) {
		// result[i] = m1[i].clone();
		// for (int j = 0; j < result[i].length; j++) {
		// result[i][j] += m2[i][j];
		// }
		//
		// }
		// return result;
	}

	public static double[][] add(double[][] m1, double[][] m2) {
		double[][] add = new double[m1.length][m1.length];
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add.length; j++) {
				add[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return add;
	}
}
