package com.tma.exercises.oop.exercise06;

public class TestCircle {
	public static void main(String[] args) {
		GeometricObject geometricObject = new Circle1(10);
		System.out.println(geometricObject.getArea());
		System.out.println(geometricObject.getPerimeter());
	}
}
