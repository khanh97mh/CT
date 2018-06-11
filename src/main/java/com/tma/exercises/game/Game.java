package com.tma.exercises.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


import com.tma.exercises.game.common.Size;
import com.tma.exercises.game.controller.ControllerImpl;
import com.tma.exercises.game.robot.Robot;
import com.tma.exercises.game.robot.RobotImpl;
import com.tma.exercises.game.table.Table;

public class Game {
	public void playGameWithFile(String filePath) {
		String command;
		Robot robot = new RobotImpl();
		Table table = new Table(new Size(5, 5));
		ControllerImpl control = new ControllerImpl(robot, table);	
		control.plugRobotIn(robot);

		try {
			FileInputStream fis = new FileInputStream(new File(filePath));
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			while ((command = br.readLine()) != null) {
				control.receiveCommand(command);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error: ");
			e.printStackTrace();
		}
	}

	public void playGameWithCommand() {
		Scanner sc = new Scanner(System.in);
		Robot robot = new RobotImpl();
		Table table = new Table(new Size(5, 5));
		ControllerImpl control = new ControllerImpl(robot, table);
		System.out.println("Enter a command, Valid commands are:");
        System.out.println("\'PLACE X,Y,NORTH|SOUTH|EAST|WEST\', MOVE, LEFT, RIGHT, REPORT or exit");
        boolean check = true;
        while (check) {
            String command = sc.nextLine();
            if ("exit".equals(command)) {
                check = false;
            } else {
                try {
                    control.receiveCommand(command);
                } catch (Exception e) {
					e.printStackTrace();
				}
            }
        }
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.playGameWithFile("input.txt");
//		game.playGameWithCommand();
	}
}
