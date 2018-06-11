package com.tma.exercises.game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import com.tma.exercises.game.common.FacingEnum;
import com.tma.exercises.game.common.Position;
import com.tma.exercises.game.common.Size;
import com.tma.exercises.game.controller.Controller;
import com.tma.exercises.game.controller.ControllerImpl;
import com.tma.exercises.game.robot.Robot;
import com.tma.exercises.game.robot.RobotImpl;
import com.tma.exercises.game.table.Table;

@RunWith(MockitoJUnitRunner.class)
public class TestMockito {

	
	@InjectMocks
	private ControllerImpl controller;
	private Table table;

	@Mock
	private Robot robot;

	@Before
	public void setUp() throws Exception {
		table = new Table(new Size(5,5));
		robot = mock(Robot.class);
		controller = new ControllerImpl(robot, table);
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void TestPLACE() {
		controller.receiveCommand("PLACE 1,2,EAST");		
		when(controller.getRobot().report()).thenReturn("1,2,EAST");
		assertEquals(robot.report(), "1,2,EAST");
		verify(robot).report();
	}
	@Test
	public void TestTurnLeft() {
		verify(robot).turnLeft();
		verify(robot, times(1)).turnLeft();
		verify(robot,never()).turnRight();
	}
	@Test
	public void TestTurnRight() {
		verify(robot).turnRight();
		verify(robot, times(1)).turnRight();
		verify(robot,never()).turnLeft();
	}
	@Test
	public void TestMove() {
		verify(robot).move();
		verify(robot, times(1)).move();
	}
}
