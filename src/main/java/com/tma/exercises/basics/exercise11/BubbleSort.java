package com.tma.exercises.basics.exercise11;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 9, 2, 4, 1, 5 };
		bubbleSort(array);
		for (int i : array)
			System.out.print(i + " ");
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (array[i - 1] > array[i]) {
					int tmp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = tmp;
					swapped = true;
				}

			}
			n = n - 1;
		} while (swapped);
	}
}
