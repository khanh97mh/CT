package com.tma.exercises.oop.exercise05;

public class TestLine {
	public static void main(String[] args) {
		System.out.println("Line");
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);

		Point p1 = new Point(0, 3);
		Point p2 = new Point(0, 4);
		Line l2 = new Line(p1, p2);
		System.out.println(l2);
		System.out.println("LineSub");
		LineSub ls = new LineSub(0, 0, 3, 4);
		System.out.println(ls);
		ls = new LineSub(p1, p2);
		System.out.println(ls);
			
	}
}
