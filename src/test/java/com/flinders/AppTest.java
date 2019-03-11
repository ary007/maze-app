package com.flinders;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import junit.framework.TestCase;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	 public void testMainMethodWithArgs() throws FileNotFoundException {
		App.main(new String[] { "./src/main/resources/maze.txt"});
	}
	
	@Test
	 public void testMainMethodWithoutArgs() throws FileNotFoundException {
		App.main();
	}
	
}
