package com.tma.exercises.oop.exercise06;

public class Circle1 implements GeometricObject {
	private double radius = 1.0;

	public Circle1(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}
