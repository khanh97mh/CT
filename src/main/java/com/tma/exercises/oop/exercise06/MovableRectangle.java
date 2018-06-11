package com.tma.exercises.oop.exercise06;

public class MovableRectangle implements Movable{
	private MovablePoint toLeft;
	private MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed) {
		toLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	public void moveUp() {
		toLeft.y -= toLeft.ySpeed;
		bottomRight.y -= bottomRight.ySpeed;
		
	}

	public void moveDown() {
		toLeft.y += toLeft.ySpeed;
		bottomRight.y += bottomRight.ySpeed;
		
	}

	public void moveLeft() {
		toLeft.x -= toLeft.xSpeed;
		bottomRight.x -= bottomRight.xSpeed;
		
	}

	public void moveRight() {
		toLeft.x += toLeft.xSpeed;
		bottomRight.x += bottomRight.xSpeed;
		
	}
	
}
