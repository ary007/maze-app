package com.flinders;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
	private char[][] mazeArray;
	private Scanner scanner;
	MazeSolver mazeSolver;
	private int startPointX;
	private int startPointY;

	Maze(String mazefile) throws FileNotFoundException {
		this.mazeArray = setMaze(mazefile);

	}

	char[][] setMaze(String mazefile) throws FileNotFoundException {
		int rows = 0;
		File f = new File(mazefile);
		scanner = new Scanner(f);
		while (scanner.hasNextLine()) {
			scanner.nextLine();
			rows++;
		}
		scanner.close();
		scanner = new Scanner(f);
		char[][] tempArray = new char[rows][];
		for (int row = 0; row < rows; row++) {
			String line = scanner.nextLine();
			tempArray[row] = new char[line.length()];
			for (int col = 0; col < line.length(); col++) {
				tempArray[row][col] = line.charAt(col);
				if (tempArray[row][col] == 'S') {
					startPointX = row;
					startPointY = col;
				}
			}
		}
		return tempArray;
	}

	public void getSolvedMaze() {
		mazeSolver = new MazeSolver(mazeArray);
		mazeArray = mazeSolver.getSolvedMaze(startPointX, startPointY);
		for (char[] X : mazeArray) {
			for (char x : X) {
				System.out.print(x);
			}
			System.out.println();
		}

	}

	public char[][] getMaze() {
		return mazeArray;
	}
}
