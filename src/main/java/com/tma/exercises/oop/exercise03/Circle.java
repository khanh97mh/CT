package com.tma.exercises.oop.exercise03;

/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
	private double radius = 1.0;
	private String color = "red";

	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public Circle() {
	}
	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// A public method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Return a description of this instance in the form of
	// Circle[radius=r,color=c]
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}