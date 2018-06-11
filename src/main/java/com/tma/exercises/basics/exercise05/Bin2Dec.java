package com.tma.exercises.basics.exercise05;

public class Bin2Dec {
	
	public static void Bin2Dec(String number) {
		System.out.println("Enter a Binary string: " + number);
		double dec = 0;
		int size = 0 ;
		for (int i = 0; i < number.length(); i++) {
			if(number.charAt(i) == '.') break;
			size++;
		}

		if(CheckBin(number)) {
			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				if (c >= '0' && c <= '1') {
					dec += (int) (c - 48) * Math.pow(2, (size - 1));
				} else if ( c == '.') {
					size++;
				}
				size--;
				
			}
			System.out.println(dec);
		} else {
			System.out.println("error: invalid binary string \"" + number + "\"");
		}
	}

	public static boolean CheckBin(String n) {
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if(!(c >= '0' && c <= '1' || c == '.')) return false;
		}
		return true;
	}
	
	
	
}
