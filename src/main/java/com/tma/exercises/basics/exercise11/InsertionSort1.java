package com.tma.exercises.basics.exercise11;

public class InsertionSort1 {

	public static void main(String[] args) {
		int[] array = {12, 11, 13, 5, 6};
		insertionSort(array);
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int min = array[i];
			int j ;
			for (j= i - 1; j >= 0; j--) {
				if (array[j] > array[j + 1] && array[j] < min) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
			array[j+1] = min;
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
