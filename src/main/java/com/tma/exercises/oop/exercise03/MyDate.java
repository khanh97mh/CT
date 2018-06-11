package com.tma.exercises.oop.exercise03;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private String[] strDay = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	private int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate(int year, int month, int day) {
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
		return strDay[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month - 1] + " " + year;
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

	public boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			return true;
		return false;
	}

	public boolean isValidDate(int year, int month, int day) {
		if (year < 1 || year > 9999)
			return false;
		if (month < 1 && month > 12)
			return false;
		if (isLeapYear(year)) {
			if (month == 2 && (day > 29 || day < 1))
				return false;
			if (day > daysInMonths[month - 1] || day < 1)
				return false;
		} else {
			if (day > daysInMonths[month - 1] || day < 1)
				return false;
		}
		return true;
	}

	public int getDayOfWeek(int year, int month, int day) {
		int century = 0;
		int[] nonLeapYear = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int[] leapYear = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		if (year / 100 == 19)
			century = 0;
		else if (year / 100 == 20)
			century = 6;
		else if (year / 100 == 21)
			century = 4;
		int m;
		if (isLeapYear(year)) {
			m = leapYear[month - 1];
		} else {
			m = nonLeapYear[month - 1];
		}

		return (century + year % 100 + (year % 100) / 4 + m + day) % 7;
	}
	
	public MyDate nextDay() {
		if(isLeapYear(year) && month == 2) {
			if(++day > 29) {
				day = 1;
				if(++month >= 12) {
					month = 1;
					year++;
				}
			}
		} else 
		if(++day > daysInMonths[month - 1]) {
			day = 1;
			if(++month >= 12) {
				month = 1;
				year++;
			}
		}
		return this;
	}

	public MyDate nextMonth() {
			if(++month >= 12) {
				if(day == daysInMonths[month - 1])
					day = daysInMonths[month - 1];
				month = 1;
				year++;
			}		
		return this;
	}

	public MyDate nextYear() {
		year++;
		return this;
	}
	public MyDate previousDay() {
		if(--day <= 0) {
			day = daysInMonths[month - 1];
			if(--month <= 0) {
				month = 12;
				--year;
			}
		}
		return this;
	}

	public MyDate previousMonth() {
		if(--month <= 0) {
			if(day == daysInMonths[month + 1])
				day = daysInMonths[month];
			month = 12;
			--year;
		} else {
			if(day == daysInMonths[month])
				day = daysInMonths[month - 1];
		}
		return this;
	}

	public MyDate previousYear() {
		--year;
		return this;
	}
}
