package com.tma.exercises.basics.exercise05;

public class Oct2Dec {
	public static void Oct2Dec(String number) {
		System.out.println("Enter a Binary string: " + number);
		double dec = 0;
		int size = 0 ;
		for (int i = 0; i < number.length(); i++) {
			if(number.charAt(i) == '.') break;
			size++;
		}

		if(CheckOtc(number)) {
			System.out.print("The equivalent decimal number for oct \"" + number + "\" is: ");
			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				if (c >= '0' && c <= '9') {
					dec += (int) (c - 48) * Math.pow(8, (size - 1));
				} else if ( c == '.') {
					size++;
				}
				size--;
				
			}
			System.out.println(dec);
		} else {
			System.out.println("error: invalid oct string \"" + number + "\"");
		}
	}

	public static boolean CheckOtc(String n) {
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if(!(c >= '0' && c <= '7' || c == '.')) return false;
		}
		return true;
	}
}
