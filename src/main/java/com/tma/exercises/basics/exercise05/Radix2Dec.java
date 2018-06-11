package com.tma.exercises.basics.exercise05;

public class Radix2Dec {
	public static void Radix2Dec(int radix, String number) {
		Bin2Dec bin2Dec = new Bin2Dec();		
		Hex2Dec hex2Dec = new Hex2Dec();		
		Oct2Dec oct2Dec = new Oct2Dec();
		
		System.out.println("Enter the radix: " + radix);
		if(radix == 2) {
			bin2Dec.Bin2Dec(number);
		}else if(radix == 8) {
			oct2Dec.Oct2Dec(number);
		}else if(radix == 16) {
			hex2Dec.Hex2Dec(number);
		}
		
	}
}
