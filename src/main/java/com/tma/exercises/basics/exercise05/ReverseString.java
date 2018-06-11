package com.tma.exercises.basics.exercise05;

import java.util.Scanner;

public class ReverseString {
	public static void ReverseString() {
		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		
		System.out.print("Enter a String: ");
		inputString = sc.nextLine();
		System.out.print("The reverse of the String \""+inputString+"\" is \"");
		for (int i = inputString.length() - 1; i >= 0; i--) {
			System.out.print(inputString.charAt(i));
		}
		System.out.println("\".");
	}
}
