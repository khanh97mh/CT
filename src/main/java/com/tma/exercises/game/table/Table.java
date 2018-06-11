package com.tma.exercises.game.table;

import com.tma.exercises.game.common.Size;
import com.tma.exercises.game.robot.RobotImpl;

public class Table {

	private Size size;




	public Table(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public boolean checkPosition(RobotImpl robot) {
		if(robot.getPosition().getX() < 0 || robot.getPosition().getX() > size.getWeight()) {
			return false;
		}
		if(robot.getPosition().getY() < 0 || robot.getPosition().getY() > size.getHeight()) {
			return false;
		}
		return true;
	}
	
}
