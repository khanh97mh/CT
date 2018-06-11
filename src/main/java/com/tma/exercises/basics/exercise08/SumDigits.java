package com.tma.exercises.basics.exercise08;

public class SumDigits {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("Usage: java SumDigits int");
			return;
		}
		int sum = 0;
		char num;
		
System.out.print("The sum of digits = ");
		for (int i = 0; i < args[0].length(); i++) {
			num = args[0].charAt(i);
			if(i != args[0].length() - 1)
			System.out.print(num + " + ");
			else
				System.out.print(num + " ");
			sum += (int)num - 48;
		}
		System.out.println(" = " + sum);
	}

}
