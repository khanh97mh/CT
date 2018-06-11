package com.tma.exercises.oop.exercise06;

public class Dog extends Animal {
	   @Override
	   public void greeting() {
	      System.out.println("Woof!");
	   }
	   
	   public void greeting(Dog another) {
	      System.out.println("Woooooooooof!");
	   }
	}
