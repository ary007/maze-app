package com.flinders;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import mockit.Expectations;
import mockit.Verifications;
public class MazeTest {
	
	
	@Test
	public void testSetMaze() throws FileNotFoundException {
		 new Expectations(Maze.class) {};
		final Maze foo = new Maze("./src/main/resources/maze.txt");
		new Verifications() {{ foo.setMaze("./src/main/resources/maze.txt");times = 1; }};
	}

}
