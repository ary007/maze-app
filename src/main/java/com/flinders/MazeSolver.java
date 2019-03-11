package com.flinders;

public class MazeSolver {

	boolean free;
	char[][] mazeArray;
	int locX = 1, locY = 1;

	MazeSolver(char[][] mazeArray) {
		this.mazeArray = mazeArray;
		free = false;
	}

	/*
	 * Method Header: isEnd
	 * 
	 * @param int x, int y
	 * 
	 * @return boolean description: checks to see if its the End
	 */
	public boolean isEnd(int x, int y) {
		if (mazeArray[x][y] == 'F')
			return true;
		else
			return false;
	}

	/*
	 * Method Header: setVisited
	 * 
	 * @param int x, int y description: sets the board to a y wherever its at to
	 * be visited
	 */
	public void setVisited(int x, int y) {
		mazeArray[x][y] = '.';

	}

	/*
	 * Method Header: isWall
	 * 
	 * @param int x, int y
	 * 
	 * @return boolean description: checks to see if there is a wall
	 */
	public boolean isWall(int x, int y) {
		if (mazeArray[x][y] == '#')
			return true;
		else
			return false;
	}

	/*
	 * Method Header: isVisited
	 * 
	 * @param int x, int y
	 * 
	 * @return boolean description:checks the array to see if it has been
	 * visited
	 */
	public boolean isVisited(int x, int y) {
		if (mazeArray[x][y] == '.')
			return true;
		else
			return false;
	}

	/*
	 * Method Header: findPath
	 * 
	 * @param int x, int y description: The base case has four parts, it returns
	 * if rows and column is negative, there is a wall or has been visited
	 * before. Next if it hits the end it sets the flag free. For the recursive
	 * part it sets where it has visited, calls itself to move in every
	 * direction.
	 */
	public void findPath(int x, int y) {
		if (x < 0 || y < 0)
			return;
		if (isWall(x, y))
			return;
		if (isVisited(x, y))
			return;
		if (isEnd(x, y)) {
			setVisited(x, y);
			free = true;
			return;
		}
		if (!free) {
			setVisited(x, y);
			findPath(x, y + 1);
			findPath(x + 1, y);
			findPath(x, y - 1);
			findPath(x - 1, y);
		}
	}

	/*
	 * Method Header: getSolvedMaze
	 * 
	 * @param int x, int y
	 * 
	 * @return boolean description: calls findPath method to get the maze path.
	 * If it cannot find, it printa message and exists.
	 */
	public char[][] getSolvedMaze(int x, int y) {
		findPath(x, y);
		if (!free) {
			System.out.println("Maze could not solved");
			System.exit(1);
		}
		return mazeArray;
	}
}
