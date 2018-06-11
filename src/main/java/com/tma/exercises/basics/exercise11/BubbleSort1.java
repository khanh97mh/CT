package com.tma.exercises.basics.exercise11;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] array = { 9, 2, 4, 1, 5 };
		bubbleSort(array);
	}

	public static void bubbleSort(int[] array) {
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
				
			}
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
