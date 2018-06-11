package com.tma.exercises.game.robot;

import com.tma.exercises.game.common.FacingEnum;
import com.tma.exercises.game.common.Position;

public interface Robot {
	
	void move();

	void turnLeft();

	void turnRight();

	String report();

	void place(Position position, FacingEnum facing);

}
