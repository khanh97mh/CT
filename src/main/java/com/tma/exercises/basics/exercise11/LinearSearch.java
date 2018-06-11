package com.tma.exercises.basics.exercise11;

public class LinearSearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println(linearSearch(array, 3));
		System.out.println(linearSearch1(array, 3));
	}
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return i;
		}
		return -1;
	}
	public static boolean linearSearch1(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return true;
		}
		return false;
	}
}
