package com.tma.exercises.basics.exercise11;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 9, 2, 4, 1, 5 };
		insertionSort(array);
		for (int i : array)
			System.out.print(i + " ");
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
}
