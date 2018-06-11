package com.tma.exercises.basics.exercise11;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 9, 2, 4, 1, 5 };
		quickSort1(array, 0, array.length - 1);
		for (int i : array)
			System.out.print(i + " ");
	}

	public static void quickSort1(int[] array, int fromIdx, int toIdx) {
		if (fromIdx < toIdx) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(array, fromIdx, toIdx);

			// Recursively sort elements before
			// partition and after partition
			quickSort1(array, fromIdx, pi - 1);
			quickSort1(array, pi + 1, toIdx);
		}
	}

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static int quickSort(int[] array, int fromIdx, int toIdx) {
		int pivot = array[toIdx];
		int i = (fromIdx - 1);
		for (int j = fromIdx; j < toIdx; j++) {
			// equal to pivot
			if (array[j] <= pivot) {
				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i + 1];
		array[i + 1] = array[toIdx];
		array[toIdx] = temp;

		return i + 1;
	}

}
