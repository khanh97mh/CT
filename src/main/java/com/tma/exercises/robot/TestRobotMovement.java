package com.tma.exercises.robot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRobotMovement {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		String f = "";
		RobotMovement rM = new RobotMovement(x, y, f);
		rM.Movement("D:\\working\\Git-TMA\\learning-space\\src\\main\\java\\com\\tma\\exercises\\input.txt");

	}
}
	