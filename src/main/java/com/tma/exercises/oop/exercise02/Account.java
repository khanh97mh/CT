package com.tma.exercises.oop.exercise02;

public class Account {
	private int id;
	private Customer customer;
	private double balance = 0.0;
	public Account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public Account(int id, Customer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	@Override
	public String toString() {
		return String.format("%s balance = %3.2f", customer, balance);
	}
	public Account deposit(double amount) {
		balance += amount;
		return this;
	}
	public Account withdraw(double amount) {
		if(balance >= amount)
			balance -= amount;
		else 
			System.out.println("amount withdrawn exceeds the current balance!");
		return this;
	}
	
}
