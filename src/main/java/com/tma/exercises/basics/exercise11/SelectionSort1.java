package com.tma.exercises.basics.exercise11;

public class SelectionSort1 {
	public static void main(String[] args) {
		int[] array = { 9, 2, 4, 1, 5 };
		selectionSort(array);
	}

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIdx] > array[j]) {
					int tmp = j;
					j = minIdx;
					minIdx = tmp;
				}
			}
			if(i != minIdx) {
				int tmp = array[i];
				array[i] = array[minIdx];
				array[minIdx] = tmp;
			}
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
