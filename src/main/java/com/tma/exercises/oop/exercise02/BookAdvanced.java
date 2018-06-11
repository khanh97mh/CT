package com.tma.exercises.oop.exercise02;

import java.util.Arrays;

public class BookAdvanced {
	private String name;
	private Author[] author;
	private double price;
	private int qty = 0;

	public BookAdvanced(String name, Author[] author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public BookAdvanced(String name, Author[] author, double price, int qty) {
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

	public Author[] getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "BookAdvanced [name=" + name + ", author=" + Arrays.toString(author) + ", price=" + price + ", qty="
				+ qty + "]";
	}

	public String getAuthorNames() {
		String authorNames = "";
		for (Author i : author)
			authorNames += i.getName() + "; ";
		return authorNames;
	}
}
