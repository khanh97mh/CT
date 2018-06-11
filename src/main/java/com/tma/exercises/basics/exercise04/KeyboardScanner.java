package com.tma.exercises.basics.exercise04;

import java.io.File;
import java.util.Scanner;

public class KeyboardScanner {
	public static void KeyboardScanner() {
		System.out.println("---------------");
		System.out.println("Input from keyboard");
		int num1 = 0;
		double num2 = 0;
		String name = "";
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num1 = sc.nextInt();
		System.out.print("Enter a floating point number: ");
		num2 = sc.nextDouble();
		System.out.print("Enter your name: ");
		sc.nextLine();
		name = sc.nextLine();
		sum = num1 + num2;
		System.out.println("Hi! "+name+", the sum of "+num1+" and "+num2+" is " + sum);
	}
}
