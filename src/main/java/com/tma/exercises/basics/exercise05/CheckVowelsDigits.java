package com.tma.exercises.basics.exercise05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckVowelsDigits {
	public static void CheckVowelsDigits() {
		System.out.println("---------------");
		String vowels = "aeiou";
		String str = "";
		int countVowel = 0;
		int countDigit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		str = sc.nextLine().trim().toLowerCase();
				System.out.println(str);;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for(int j = 0; j < vowels.length(); j++) {
				if(c == vowels.charAt(j)) {
					countVowel++;
				}
			}
			if(c >= '0' && c <= '9') {
				countDigit++;
			}
		}
		System.out.printf("\nNumber of vowels: %d (%.2f%%)", countVowel, ((float)countVowel/str.length())*100);
		System.out.printf("\nNumber of digit: %d (%.2f%%)", countDigit, ((float)countDigit/str.length())*100);
	}
}
