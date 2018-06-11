package com.tma.exercises.basics.exercise05;

public class PhoneKeyPad {
	public static void PhoneKeyPad(String str) {
		System.out.println("---------------");
		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);
			if(c == 'a' || c == 'b' || c == 'c') {
				System.out.print(2);
			} else if(c == 'd' || c == 'e' || c == 'f') {
				System.out.print(3);
			} else if(c == 'g' || c == 'h' || c == 'i') {
				System.out.print(4);
			} else if(c == 'j' || c == 'j' || c == 'l') {
				System.out.print(5);
			} else if(c == 'm' || c == 'n' || c == 'o') {
				System.out.print(6);
			} else if(c == 'p' || c == 'q' || c == 'r' || c == 's') {
				System.out.print(7);
			} else if(c == 't' || c == 'u' || c == 'v') {
				System.out.print(8);
			} else if(c == 'w' || c == 'x' || c == 'y' || c == 'z') {
				System.out.print(9);
			} else {
				
			}
		} 
	}
}
