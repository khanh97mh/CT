package com.tma.exercises.oop.exercise06;

public class MovablePoint implements Movable { // saved as "MovablePoint.java"
	// instance variables
	int x, y, xSpeed, ySpeed; // package access

	// Constructor

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// Implement abstract methods declared in the interface Movable
	public void moveUp() {
		y -= ySpeed; // y-axis pointing down for 2D graphics
	}

	public void moveDown() {
		// TODO Auto-generated method stub
		y += ySpeed;
	}

	public void moveLeft() {
		// TODO Auto-generated method stub
		x -= xSpeed;
	}

	public void moveRight() {
		// TODO Auto-generated method stub
		x += xSpeed;
	}
	public String toString() {
		return "(" + x + "," + y + "), speed = (" + xSpeed + ", " + ySpeed + ")";
	}
}
