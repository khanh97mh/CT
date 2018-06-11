package com.tma.exercises.oop.exercise01;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		if (checkDay(day))
			this.day = day;
		if (checkMonth(month))
			this.month = month;
		if (checkYear(year))
			this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (checkDay(day))
			this.day = day;
		System.out.println("Error");
	}

	public int getMounth() {
		return month;
	}

	public void setMounth(int month) {
		if (checkMonth(month))
			this.month = month;
		System.out.println("Error");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (checkYear(year))
			this.year = year;
		System.out.println("Error");
	}

	public void setDate(int day, int month, int year) {
		if (checkDay(day))
			this.day = day;
		if (checkMonth(month))
			this.month = month;
		if (checkYear(year))
			this.year = year;
	}

	public String toString() {
		String date = "";
		if(day < 10)
			date += "0" + day;
		else
			date += day;
		if(month < 10)
			date += "\0" + month;
		else
			date += month;
		return date + "\\" + year;
	}

	public boolean checkDay(int day) {
		return 1 <= day && day <= 31;
	}

	public boolean checkMonth(int month) {
		return 1 <= month && month <= 12;
	}

	public boolean checkYear(int year) {
		return 1900 <= year && year <= 9999;
	}

}
