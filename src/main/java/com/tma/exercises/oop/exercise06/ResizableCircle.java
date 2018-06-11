package com.tma.exercises.oop.exercise06;

public class ResizableCircle extends Circle implements Resizable {

	// Constructor
	public ResizableCircle(double radius) {
		super(radius);
	}

	public double resize(int percent) {
		return super.getRadius() * percent / 100.0;
	}

	// Implement methods defined in the interface Resizable
}
