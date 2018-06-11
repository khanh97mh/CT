package com.tma.exercises.basics.exercise11;

import java.lang.reflect.Array;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int[] array = { 11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45 };
		System.out.println(binarySearch(array, 14));
	}

	public static boolean binarySearch(int[] array, int key) {
		return binarySearch(array, key, 0, array.length - 1);
	}

	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		if (fromIdx == toIdx) {
			if (array[fromIdx] == key)
				return true;
			else
				return false;
		} else {
			int mid = (fromIdx + toIdx) / 2;
			if (key == array[mid])
				return true;
			else if (key < array[mid])
				toIdx = mid - 1;
			else
				fromIdx = mid + 1;
		}
		return binarySearch(array, key, fromIdx, toIdx);
	}
}
