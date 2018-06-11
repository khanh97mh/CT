package com.tma.exercises.oop.exercise05;

public class Cylinder {
	private Circle base; // Base circle, an instance of Circle class
	private double height;

	// Constructor with default color, radius and height
	public Cylinder() {
		base = new Circle(); // Call the constructor to construct the Circle
		height = 1.0;
	}

	public Cylinder(Circle base, double height) {
		this.base = base;
		this.height = height;
	}

	// A public method for retrieving the height
	public double getHeight() {
		return height;
	}

	// A public method for computing the volume of cylinder
	// use superclass method getArea() to get the base area
	public double getVolume() {
		return base.getArea() * height;
	}

	@Override
	public String toString() { // in Cylinder class
		return "Cylinder: subclass of " + super.toString() // use Circle's toString()
				+ " height=" + height;
	}
}
