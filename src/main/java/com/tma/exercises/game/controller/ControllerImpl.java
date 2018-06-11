package com.tma.exercises.game.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tma.exercises.game.common.CommandType;
import com.tma.exercises.game.common.FacingEnum;
import com.tma.exercises.game.common.Position;
import com.tma.exercises.game.common.Size;
import com.tma.exercises.game.robot.Robot;
import com.tma.exercises.game.robot.RobotImpl;
import com.tma.exercises.game.table.Table;

public class ControllerImpl implements Controller {

	private Robot robot;
	private Table table;

	public ControllerImpl() {
	}

	public ControllerImpl(Robot robot, Table table) {
		this.robot = robot;
		this.table = table;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public void receiveCommand(String command) {

		if (command.startsWith(CommandType.PLACE.name())) {

			String pattern = "^PLACE (\\d),(\\d),(NORTH|SOUTH|EAST|WEST)";
			Pattern rrr = Pattern.compile(pattern);
			Matcher m = rrr.matcher(command);

			Position position = null;
			FacingEnum facing = null;

			if (m.find()) {
				position = new Position(Integer.parseInt(m.group(1)), Integer.parseInt(m.group(2)));
				facing = FacingEnum.valueOf(m.group(3));
			} else {
				System.out.println("Error null position");
			}

			RobotImpl r = new RobotImpl(position, facing);
			if (table.checkPosition(r)) {
				robot.place(position, facing);
			}

		} else if (command.startsWith(CommandType.MOVE.name()) && ((RobotImpl) robot).isEmpty()) {
			robot.move();
			if (!table.checkPosition((RobotImpl) robot)) {
				((RobotImpl) robot).reMove();
			}
		} else if (command.startsWith(CommandType.LEFT.name()) && ((RobotImpl) robot).isEmpty()) {
			robot.turnLeft();
		} else if (command.startsWith(CommandType.RIGHT.name()) && ((RobotImpl) robot).isEmpty()) {
			robot.turnRight();
		} else if (command.startsWith(CommandType.REPORT.name()) && ((RobotImpl) robot).isEmpty()) {
			robot.report();
		} else {
			System.out.println("Error: Invalid command!");
		}
	}

	public void plugRobotIn(Robot robot) {
		this.robot = robot;
	}

}
