package com.tma.exercises.basics.exercise07;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		if (isOdd(5)) {
			System.out.println("ODD");
		} else {
			System.out.println("EVEN");
		}

		if (hasEight(180)) {
			System.out.println("Has 8");
		} else {
			System.out.println("No");
		}

		// System.out.println("The magic sum is: " + MagicSum());

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] array3 = { 1, 2, 6, 2, 4, 2, 5, 9 };
		double[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArray(array);
		printArray(array1);
		printArray(array2);
		System.out.println("Has " + isEmptyArr(array) + " element array");
		System.out.println(arrayToString(array));
		System.out.println(contains(array, 51));
		System.out.println(search(array, 5));
		System.out.println(equals(array, array3));
		int a[] = copyOf(array, 0);
		printArray(a);
		printArray(reverse(array));
		System.out.println(swap(array, array3));

	}
	

	public static boolean swap(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			int tmp = array1[i];
			array1[i] = array2[i];
			array2[i] = tmp;
		}
		printArray(array1);
		printArray(array2);
		return true;
	}

	public static int[] reverse(int[] array) {
		int size = array.length;
		int[] tmp = new int[size];
		for (int i = 0; i < size; i++) {
			tmp[i] = array[size - i - 1];
		}
		return tmp;
	}

	public static int[] copyOf(int[] array, int newLength) {
		if (newLength == 0) {
			System.out.println("Error!");
			return new int[1];
		}
		int[] arr = new int[newLength];
		int size = newLength;
		if (array.length < newLength) {
			size = array.length;
		}
		for (int i = 0; i < size; i++) {
			arr[i] = array[i];
		}
		return arr;
	}

	public static boolean isOdd(int number) {
		if (number % 2 != 0)
			return true;
		return false;
	}

	public static boolean hasEight(int number) {
		int check = 1;
		while (number > 0) {
			check = number % 10;
			if (check == 8) {
				return true;
			}
			number /= 10;
		}
		return false;
	}

	public static int MagicSum() {
		int sum = 0;
		int number = 0;
		Scanner sc = new Scanner(System.in);
		while (number != -1) {
			System.out.print("Enter a positive integer or -1 to exit: ");
			number = sc.nextInt();
			if (hasEight(number)) {
				sum += number;
			}
		}
		return sum;
	}

	public static void printArray(int[] array) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println();
	}

	public static void printArray(double[] array) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println();
	}

	public static void printArray(float[] array) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println();
	}

	public static int isEmptyArr(int[] array) {
		return array.length;
	}

	public static String arrayToString(int[] array) {
		String str = array[0] + "";
		for (int i = 1; i < array.length; i++) {
			str += ", " + array[i];
		}
		return str;
	}

	public static boolean contains(int[] array, int key) {
		for (int arr : array) {
			if (key == arr)
				return true;
		}
		return false;
	}

	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] copyOf(int[] array) {
		return array;
	}
}
