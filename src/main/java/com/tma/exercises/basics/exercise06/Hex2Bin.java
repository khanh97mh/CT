package com.tma.exercises.basics.exercise06;

public class Hex2Bin {
	public static void Hex2Bin(String number) {
		System.out.println("Enter a Hexadecimal string: " + number);
		String[] bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" };
		String dec = "";
		if(CheckHex(number)) {
			System.out.print("The equivalent decimal number for binary \"" + number + "\" is: ");
			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				if (c >= '0' && c <= '9') {
					dec += bin[(int) (c - 48)] + " ";
				} else if (c >= 'a' && c <= 'f') {
					dec += bin[(int) (c - 87)] + " ";
				} else if (c >= 'A' && c <= 'F') {
					dec += bin[(int) (c - 55)] + " ";
				} 
				
			}
			System.out.println(dec);
		} else {
			System.out.println("error: invalid binary string \"" + number + "\"");
		}
	}

	public static boolean CheckHex(String n) {
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if (!(c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F' || c == '.'))
				return false;
		}
		return true;
	}
}
