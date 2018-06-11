package com.tma.exercises.basics.exercise09;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = "";
		Random rd = new Random();
		int randomNumber = rd.nextInt(100);  
		int count = 1;
		System.out.println("Key in your guess:");
		key = sc.nextLine();
//		while (key != randomNumber) {
//			if (key < randomNumber) {
//				System.out.println("Try higher");
//			}
//			if (key > randomNumber) {
//				System.out.println("Try lower");
//			}
//			count++;
//			key = sc.nextInt();
//		}
		System.out.println("You got it in " + count + " trials!");
	}
}
