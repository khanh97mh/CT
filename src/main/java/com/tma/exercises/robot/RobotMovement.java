package com.tma.exercises.robot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotMovement {
	private int x = -1;
	private int y = -1;
	private String f;

	public RobotMovement(int x, int y, String f) {
		this.x = x;
		this.y = y;
		this.f = f;
		if (!checkPoint(this)) {
			System.out.println("Error!");
			x = y = 0;
			f = "NORTH";
		}
	}

	public RobotMovement getMove() {
		if (f.equals("NORTH")) {
			y++;
		} else if (f.equals("SOUTH")) {
			y--;
		} else if (f.equals("EAST")) {
			x++;
		} else if (f.equals("WEST")) {
			x--;
		}
		if (!checkPoint(this)) {
			System.out.println("Error!");
			x = y = 0;
			f = "NORTH";
		}
		return this;

	}

	public RobotMovement getLeft() {
		if (f.equals("NORTH")) {
			f = "WEST";
		} else if (f.equals("SOUTH")) {
			f = "EAST";
		} else if (f.equals("EAST")) {
			f = "NORTH";
		} else if (f.equals("WEST")) {
			f = "SOUTH";
		}
		if (!checkPoint(this)) {
			System.out.println("Error!");
			x = y = 0;
			f = "NORTH";
		}
		return this;
	}

	public RobotMovement getRight() {
		if (f.equals("NORTH")) {
			f = "EAST";
		} else if (f.equals("SOUTH")) {
			f = "WEST";
		} else if (f.equals("EAST")) {
			f = "SOUTH";
		} else if (f.equals("WEST")) {
			f = "NORTH";
		}
		if (!checkPoint(this)) {
			System.out.println("Error!");
			x = y = 0;
			f = "NORTH";
		}
		return this;
	}

	public String Report() {
		return x + "," + y + "," + f;
	}

	public void Movement(String input) {
		try {
			FileInputStream fis = new FileInputStream(new File(input));
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line;
			String[] inputStr;
			while ((line = br.readLine()) != null) {
				//line = line.trim();
				inputStr = line.replace(",", " ").replaceAll("\\s+", " ").split(" ");
				if(inputStr.length > 1) {
					x = Integer.parseInt(inputStr[1]);
					y = Integer.parseInt(inputStr[2]);
					f = inputStr[3];
					if (x < 0 || x > 5 || y < 0 || y > 5)
						continue;
				}
				if (line != null && !line.isEmpty() && checkPoint(this)) {
					if (line.equals("MOVE")) {
						getMove();
					} else if (line.equals("LEFT")) {
						getLeft();
					} else if (line.equals("RIGHT")) {
						getRight();
					} else if (line.equals("REPORT")) {
						System.out.println(Report());
					}
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean checkPoint(RobotMovement p) {
		if (x < 0 || x > 5 || y < 0 || y > 5)
			return false;
		return true;
	}

}
