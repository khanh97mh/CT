package com.tma.exercises.basics.exercise02;

public class CheckOddEven {
	public static void CheckOddEven(int mark) {
		System.out.println("---------------");
		System.out.println("The number is " + mark);
		if(mark % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		System.out.println("BYE!");
	}
}
