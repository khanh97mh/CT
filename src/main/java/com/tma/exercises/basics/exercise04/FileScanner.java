package com.tma.exercises.basics.exercise04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
	public static void FileScanner(String input) throws FileNotFoundException{
		System.out.println("---------------");
		System.out.println("Input from file");
		int num1 = 0;
		double num2 = 0;
		String name = "";
		double sum = 0;
		
		Scanner sc = new Scanner(new File(input));
		num1 = sc.nextInt();
		num2 = sc.nextDouble();
		sc.nextLine();
		name = sc.nextLine();
		sum = num1 + num2;
		
		System.out.println("Enter an integer: " +  num1);
		System.out.println("Enter a floating point number: " + num2);
		System.out.println("Enter your name: " + name);
		System.out.println("Hi! "+name+", the sum of "+num1+" and "+num2+" is " + sum);
	}
}
