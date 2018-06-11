package com.tma.exercises.game.controller;

import com.tma.exercises.game.robot.Robot;

public interface Controller {
	
	void receiveCommand(String command);
	void plugRobotIn(Robot robot);

}
