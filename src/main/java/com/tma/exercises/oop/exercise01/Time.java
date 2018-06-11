package com.tma.exercises.oop.exercise01;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		String time = "";
		if (hour < 10)
			time += "0" + hour;
		else
			time += hour;
		if (minute < 10)
			time += ":0" + minute;
		else
			time += ":" + minute;
		if (second < 10)
			time += ":0" + second;
		else
			time += ":" + second;

		return time;
	}

	public Time nextSecond() {
		Time time = new Time(hour, minute, second++);
		if (time.second >= 59) {
			time.second = 0;
			time.minute++;
			if (time.minute >= 59) {
				time.minute = 0;
				time.hour++;
				if (hour >= 23) {
					time.hour = time.minute = time.second = 0;
				}
			}
		} else
			time.setSecond(second++);
		return time;
	}

	public Time previousSecond() {
		Time time = new Time(hour, minute, second--);
		if (time.second <= 0) {
			time.second = 59;
			time.minute--;
			if (time.minute <= 0) {
				time.minute = 59;
				time.hour--;
				if (hour <= 0) {
					time.hour = 23;
					time.minute = time.second = 59;
				}
			}
		} else
			time.setSecond(second--);
		return time;
	}

	public static void main(String[] args) {
		Time time = new Time(0, 0, 0);
		System.out.println(time);
	}
}
