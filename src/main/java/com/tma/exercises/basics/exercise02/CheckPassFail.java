package com.tma.exercises.basics.exercise02;

public class CheckPassFail {
	public static void CheckPassFail(int mark) {
		System.out.println("---------------");
		System.out.println("The mark is " + mark);
		if(mark < 50) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		System.out.println("DONE");
	}
}
