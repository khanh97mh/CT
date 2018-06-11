package com.tma.exercises;

public class Cal {
    public int add(int first, int second) {
        return first + second;
    }
    
//    enum CommandType {
//    	PLACE,MOVE,REPORT
//    }
    
    public static void main(String[] args) {
//    	String s = "PLACE 1,2,WEST";
//    	if (s.startsWith(CommandType.PLACE.toString())) {
//    		System.out.println("111");
//    	} else {
//    		System.out.println("2222");
//    	}
//    	System.out.println(CommandType.PLACE);
    	Cal cal = new Cal();
    	System.out.println(cal.add(1,1));
    }
}
