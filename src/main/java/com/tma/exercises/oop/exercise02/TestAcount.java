package com.tma.exercises.oop.exercise02;

public class TestAcount {
	public static void main(String[] args) {
		Account account = new Account(1, new Customer(1, "Khanh", 'm'), 100000);
		
		System.out.println(account.withdraw(500));
	}
}
