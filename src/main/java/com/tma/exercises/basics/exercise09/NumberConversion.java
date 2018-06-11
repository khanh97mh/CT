package com.tma.exercises.basics.exercise09;


public class NumberConversion {
	private final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";
    
    public static void main(String[] args)
    {
        NumberConversion aNumberConversion = new NumberConversion();
        
        String numberStr = "A1B2";
        int    inRadix   = 16;
        int    outRadix  = 2;
        System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n"
                , numberStr, inRadix
                , aNumberConversion.toRadix(numberStr, inRadix, outRadix), outRadix
        );
    }
    
    private int toInt(String in, int inRadix)
    {
        int result = 0;
        for(int i = in.length()-1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length()-1 - i));
        }
        return result;
    }
    
    private String toRadix(int number, int radix)
    {
        String result = "";
        if (radix == 0) {
            return result;
        }
        
        while (number > 0) {
            result = alphabet.charAt(number%radix) + result;
            number /= radix;
        }
        return result;
    }
        
    private String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }
}
