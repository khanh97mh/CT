package com.tma.exercises.basics.exercise11;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45 };
		System.out.println("11 found in the array is: " + binarySearch(array, 11));
		System.out.println("21 found in the array is: " + binarySearch(array, 21));
	}

	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		if (fromIdx == toIdx) {
			if (array[fromIdx] == key)
				return true;
			else
				return false;
		} else {
			int midIdx = (fromIdx + toIdx) / 2;
			if (array[midIdx] == key)
				return true;
			if (key > array[midIdx])
				fromIdx = midIdx + 1;
			else
				toIdx = midIdx;
			return binarySearch(array, key, fromIdx, toIdx);
		}
	}
	public static boolean binarySearch(int[] array, int key) {
		return binarySearch(array, key, 0, array.length - 1);
	}
}
