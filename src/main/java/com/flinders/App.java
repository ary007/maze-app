package com.flinders;

import java.io.FileNotFoundException;

public class App {
	public static void main(String... args) throws FileNotFoundException {
		Maze maze;
		if (args.length > 0) {
			maze = new Maze(args[0]);
		} else {
			maze = new Maze("./src/main/resources/maze.txt");
		}
		maze.getSolvedMaze();
	}
}
