package com.tma.exercises.basics.exercise04;

import java.io.FileNotFoundException;

public class Exercise04 {
	public static void main(String[] args) throws FileNotFoundException {
		KeyboardScanner keyboardScanner = new KeyboardScanner();
		keyboardScanner.KeyboardScanner();
		
		FileScanner fileScanner = new FileScanner();
		fileScanner.FileScanner("D:\\working\\Git-TMA\\learning-space\\src\\main\\java\\com\\tma\\exercises\\basics\\exercise04\\input.txt");
		
		CircleComputation circleComputation = new CircleComputation();
		circleComputation.CircleComputation();
	}
}
