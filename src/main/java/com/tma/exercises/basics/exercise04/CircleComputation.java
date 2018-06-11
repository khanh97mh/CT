package com.tma.exercises.basics.exercise04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleComputation {
	public static void CircleComputation() {
		System.out.println("---------------");
		double radius;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a positive integer or -1 to exit: ");
			radius = sc.nextDouble();
			if(radius == -1) break;
			
			System.out.printf("The area is: %.2f\n", radius*radius*Math.PI);
			System.out.printf("The circumference is: %.2f\n\n", 2*radius*Math.PI);
		}
		
	}
}
