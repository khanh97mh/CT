package com.tma.exercises.oop.exercise02;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	public Book(String name, Author author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name  + ", " + author + ", price=" + price + ", qty=" + qty + "]";
	}
	public String getAuthorName() {
		   return author.getName();
	}
	public String getAuthorEmail() {
		   return author.getEmail();
	}
	public char getAuthorGender() {
		   return author.getGender();
	}
	
}
