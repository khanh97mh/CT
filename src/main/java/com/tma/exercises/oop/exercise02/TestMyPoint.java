package com.tma.exercises.oop.exercise02;

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		System.out.println(p1.distance(5, 6));
		
		p1 = new MyPoint(3, 4);
		MyPoint p2 = new MyPoint(5, 6);
		System.out.println(p1.distance(p2));
		
		p1 = new MyPoint(3, 4);
		System.out.println(p1.distance());
		
		MyPoint[] points = new MyPoint[10];  // Declare and allocate an array of MyPoint
		for (int i = 0; i < points.length; i++) {
		   points[i] = new MyPoint(i,i);    // Allocate each of MyPoint instances
		}
	}
}
