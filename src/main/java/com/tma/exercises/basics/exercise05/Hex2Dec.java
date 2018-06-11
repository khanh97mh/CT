package com.tma.exercises.basics.exercise05;

public class Hex2Dec {
	public static void Hex2Dec(String number) {
		System.out.println("Enter a Binary string: " + number);
		double dec = 0;
		int size = 0 ;
		for (int i = 0; i < number.length(); i++) {
			if(number.charAt(i) == '.') break;
			size++;
		}

		if(CheckHex(number)) {
			System.out.print("The equivalent decimal number for binary \"" + number + "\" is: ");
			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				if (c >= '0' && c <= '9') {
					dec += (int) (c - 48) * Math.pow(16, (size - 1));
				} else if (c >= 'a' && c <= 'f') {
					dec += (int) (c - 87) * Math.pow(16, (size - 1));
				} else if (c >= 'A' && c <= 'F') {
					dec += (int) (c - 55) * Math.pow(16, (size - 1));
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

	public static boolean CheckHex(String n) {
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if(!(c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F' || c == '.')) return false;
		}
		return true;
	}
}
