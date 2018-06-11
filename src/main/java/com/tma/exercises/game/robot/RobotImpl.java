package com.tma.exercises.game.robot;

import com.tma.exercises.game.common.FacingEnum;
import com.tma.exercises.game.common.Position;

public class RobotImpl implements Robot {
	Position position;
	FacingEnum facing;
	

	public RobotImpl() {
	}

	public RobotImpl(Position position, FacingEnum facing) {
		this.position = position;
		this.facing = facing;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public FacingEnum getFacing() {
		return facing;
	}

	public void setFacing(FacingEnum facing) {
		this.facing = facing;
	}

	public void move() {
		// TODO Auto-generated method stub
		if (facing.equals(facing.NORTH)) {
			position.setY(position.getY() + 1);
		} else if (facing.equals(facing.SOUTH)) {
			position.setY(position.getY() - 1);
		} else if (facing.equals(facing.EAST)) {
			position.setX(position.getX() + 1);
		} else if (facing.equals(facing.WEST)) {
			position.setX(position.getX() - 1);
		} else {
			System.out.println("Error: Invalid facing!");
		}
	}
	
	public void reMove() {
		// TODO Auto-generated method stub
		if (facing.equals(facing.NORTH)) {
			position.setY(position.getY() - 1);
		} else if (facing.equals(facing.SOUTH)) {
			position.setY(position.getY() + 1);
		} else if (facing.equals(facing.EAST)) {
			position.setX(position.getX() - 1);
		} else if (facing.equals(facing.WEST)) {
			position.setX(position.getX() + 1);
		} else {
			System.out.println("Error: Invalid facing!");
		}
	}

	public void turnLeft() {
		if (facing.equals(facing.NORTH)) {
			facing = FacingEnum.WEST;
		} else if (facing.equals(facing.SOUTH)) {
			facing = FacingEnum.EAST;
		} else if (facing.equals(facing.EAST)) {
			facing = FacingEnum.NORTH;
		} else if (facing.equals(facing.WEST)) {
			facing = FacingEnum.SOUTH;
		} else {
			System.out.println("Error: Invalid facing!");
		}
	}

	public void turnRight() {
		if (facing.equals(facing.NORTH)) {
			facing = FacingEnum.EAST;
		} else if (facing.equals(facing.SOUTH)) {
			facing = FacingEnum.WEST;
		} else if (facing.equals(facing.EAST)) {
			facing = FacingEnum.SOUTH;
		} else if (facing.equals(facing.WEST)) {
			facing = FacingEnum.NORTH;
		} else {
			System.out.println("Error: Invalid facing!");
		}
	}

	public String report() {
		if(position == null || facing == null)
			return null;
		
		System.out.println(this);
		return this.toString();
	}

	@Override
	public String toString() {
		return position.getX() + "," + position.getY() + "," + facing;
	}

	public void place(Position position, FacingEnum facing) {
		this.position = position;
		this.facing = facing;
	}
	public boolean isEmpty() {
		if(position != null && facing != null) {
			return true;
		}
		return false;
	}

}
