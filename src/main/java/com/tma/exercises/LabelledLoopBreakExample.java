package com.tma.exercises;
public class LabelledLoopBreakExample {
	 
    public static void main(String[] args) {
 
        System.out.println("Labelled Loop Break example");
 
        int i = 0;
 
        label1: while (i < 5) {
 
            System.out.println("----------------------\n");
            System.out.println("i = " + i);
            i++;
 
            gotot : for (int j = 0; j < 3; j++) {
 
                System.out.println("  --> " + j);
                if (j > 0) {
                    // Thoát khỏi vòng lặp có nhãn label1.
                    break gotot;
                }
            }
 
        }
 
        System.out.println("Done!");
 
    }
 
}