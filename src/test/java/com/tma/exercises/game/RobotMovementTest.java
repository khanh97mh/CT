package com.tma.exercises.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tma.exercises.game.common.FacingEnum;
import com.tma.exercises.game.common.Position;
import com.tma.exercises.game.common.Size;
import com.tma.exercises.game.controller.ControllerImpl;
import com.tma.exercises.game.robot.Robot;
import com.tma.exercises.game.robot.RobotImpl;
import com.tma.exercises.game.table.Table;

public class RobotMovementTest {
	Robot robot = new RobotImpl();
	Table table = new Table(new Size(5,5));
	ControllerImpl controller = new ControllerImpl(robot, table);

	@Test
	public void testPlace() {
		controller.receiveCommand("PLACE 1,2,EAST");		
		assertEquals("1,2,EAST", robot.report());
	}
	
	@Test
	public void testNullPlace() {
		controller.receiveCommand("PLACE 6,2,EAST");		
		assertEquals(null, robot.report());
	}

	@Test
	public void testMove() {
		robot = new RobotImpl(new Position(1, 2), FacingEnum.EAST);
		controller = new ControllerImpl(robot, table);
		controller.receiveCommand("MOVE");
		assertEquals("2,2,EAST", robot.report());
	}
	@Test
	public void testNullMove() {
		robot = new RobotImpl(new Position(5, 2), FacingEnum.EAST);
		controller = new ControllerImpl(robot, table);
		controller.receiveCommand("MOVE");
		assertEquals("5,2,EAST", robot.report());
	}
	@Test
	public void testLeft() {
		robot = new RobotImpl(new Position(1, 2), FacingEnum.EAST);
		controller = new ControllerImpl(robot, table);
		controller.receiveCommand("LEFT");
		assertEquals("1,2,NORTH", robot.report());
	}
	@Test
	public void testRight() {
		robot = new RobotImpl(new Position(1, 2), FacingEnum.EAST);
		controller = new ControllerImpl(robot, table);
		controller.receiveCommand("RIGHT");
		assertEquals("1,2,SOUTH", robot.report());
	}
	@Test
	public void testFull() {
		controller.receiveCommand("PLACE 1,2,EAST");	
		controller.receiveCommand("MOVE");
		controller.receiveCommand("MOVE");
		controller.receiveCommand("LEFT");
		controller.receiveCommand("MOVE");
		controller.receiveCommand("REPORT");
		assertEquals("3,3,NORTH", robot.report());
	}
}
