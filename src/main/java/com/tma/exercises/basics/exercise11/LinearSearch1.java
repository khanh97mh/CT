package com.tma.exercises.basics.exercise11;

public class LinearSearch1 {
	public static void main(String[] args) {
		int[] array = {1, 4, 8, 9, 5, 3, 6, 4};
		System.out.println("Return the array index, if key is 5: " + linearSearchIdx(array, 5));
		System.out.println("Return the true/false, if key is 15: " + linearSearchBoolean(array, 15));
	}
	
	public static int linearSearchIdx(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean linearSearchBoolean(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return true;
			}
		}
		return false;
	}
}
