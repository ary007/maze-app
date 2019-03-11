package com.flinders;

import java.io.FileNotFoundException;

import org.junit.Test;

public class AppTest {
	@Test
	public void testMainMethodWithArgs() throws FileNotFoundException {
		App.main(new String[] { "./src/main/resources/maze.txt" });
	}

	@Test
	public void testMainMethodWithoutArgs() throws FileNotFoundException {
		App.main();
	}

}
