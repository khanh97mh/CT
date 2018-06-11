package com.tma.exercises.basics.exercise05;

public class Exercise05 {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		//reverseString.ReverseString();
		
		CheckVowelsDigits checkVowelsDigits = new CheckVowelsDigits();
		//checkVowelsDigits.CheckVowelsDigits();
		
		PhoneKeyPad PhoneKeyPad = new PhoneKeyPad();
		PhoneKeyPad.PhoneKeyPad("abc");
		
		TestPalindromicWord TestPalindromicWord = new TestPalindromicWord();//Chua lam
		TestPalindromicWord.TestPalindromicWord();
		
		Bin2Dec Bin2Dec = new Bin2Dec();
		Bin2Dec.Bin2Dec("10101100.01101");
		Bin2Dec.Bin2Dec("1234");
		
		Hex2Dec Hex2Dec = new Hex2Dec();
		Hex2Dec.Hex2Dec("CDF.91");
		Hex2Dec.Hex2Dec("1y3");
		
		Oct2Dec Oct2Dec = new Oct2Dec();
		Oct2Dec.Oct2Dec("5314.17");
		
		Radix2Dec Radix2Dec = new Radix2Dec();
		Radix2Dec.Radix2Dec(16, "1a");
	}
}
