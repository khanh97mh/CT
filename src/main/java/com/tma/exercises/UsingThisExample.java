package com.tma.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tma.exercises.basics.exercise09.Factorial1to10;
import com.tma.exercises.game.common.FacingEnum;

public class UsingThisExample {
	 
    public static void main(String[] args) {
    	 // String to be scanned to find the pattern.
        String line = "PLACE 5,2,EAST";
        FacingEnum f = null;
        String pattern = "(\\d),(\\d),("+f.NORTH+"|"+f.SOUTH+"|"+f.EAST+"|"+f.WEST+")";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
           System.out.println("Found value: " + m.group(1) );
           System.out.println("Found value: " + m.group(2) );
           System.out.println("Found value: " + m.group(3) );
        }else {
           System.out.println("NO MATCH");
        }
	}
 
}