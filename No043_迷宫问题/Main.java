package No043_√‘π¨Œ Ã‚;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static class Grid {
		public int x;
		public int y;
		public int f;
		public int g;
		public int h;
		public Grid parent;

		public Grid(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void initGrid(Grid parent, Grid end) {
			this.parent = parent;
			if (parent != null) {
				this.g = parent.g + 1;
			} else {
				this.g = 1;
			}
			this.h = Math.abs(this.x - end.x) + Math.abs(this.y - end.y);
			this.f = this.g + this.h;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String nm = scanner.nextLine();
			int n = Integer.valueOf(nm.split(" ")[0]);
			int m = Integer.valueOf(nm.split(" ")[1]);
			int[][] maze = new int[n][m];
			for (int i = 0; i < n; i++) {
				String im = scanner.nextLine();
				for (int j = 0; j < m; j++) {
					maze[i][j] = Integer.valueOf(im.split(" ")[j]);
				}
			}
			Grid startGrid = new Grid(0, 0);
			Grid endGrid = new Grid(n - 1, m - 1);
			Grid resultGrid = aStarSearch(startGrid, endGrid, maze);
			ArrayList<Grid> path = new ArrayList<Grid>();
			while (resultGrid != null) {
				path.add(new Grid(resultGrid.x, resultGrid.y));
				resultGrid = resultGrid.parent;
			}
			Collections.reverse(path);
			for (Grid g : path) {
				System.out.println("(" + g.x + "," + g.y + ")");
			}
		}
		scanner.close();
	}

	public static Grid aStarSearch(Grid startGrid, Grid endGrid, int[][] maze) {
		ArrayList<Grid> openList = new ArrayList<Grid>();
		ArrayList<Grid> closeList = new ArrayList<Grid>();
		openList.add(startGrid);
		while (openList.size() > 0) {
			Grid currentGrid = findMinGrid(openList);
			openList.remove(currentGrid);
			closeList.add(currentGrid);
			ArrayList<Grid> neighbors = findNeighbors(currentGrid, openList, closeList, maze);
			for (Grid grid : neighbors) {
				if (!openList.contains(grid)) {
					grid.initGrid(currentGrid, endGrid);
					openList.add(grid);
				}
			}
			for (Grid grid : openList) {
				if (grid.x == endGrid.x && grid.y == endGrid.y) {
					return grid;
				}
			}
		}
		return null;
	}

	private static Grid findMinGrid(ArrayList<Grid> openList) {
		Grid tempGrid = openList.get(0);
		for (Grid grid : openList) {
			if (grid.f < tempGrid.f) {
				tempGrid = grid;
			}
		}
		return tempGrid;
	}

	private static ArrayList<Grid> findNeighbors(Grid grid, ArrayList<Grid> openList, ArrayList<Grid> closeList,
			int[][] maze) {
		ArrayList<Grid> gridList = new ArrayList<Grid>();
		if (isValidGrid(grid.x, grid.y - 1, openList, closeList, maze)) {
			gridList.add(new Grid(grid.x, grid.y - 1));
		}
		if (isValidGrid(grid.x, grid.y + 1, openList, closeList, maze)) {
			gridList.add(new Grid(grid.x, grid.y + 1));
		}
		if (isValidGrid(grid.x - 1, grid.y, openList, closeList, maze)) {
			gridList.add(new Grid(grid.x - 1, grid.y));
		}
		if (isValidGrid(grid.x + 1, grid.y, openList, closeList, maze)) {
			gridList.add(new Grid(grid.x + 1, grid.y));
		}
		return gridList;
	}

	private static boolean isValidGrid(int x, int y, ArrayList<Grid> openList, ArrayList<Grid> closeList,
			int[][] maze) {
		if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length) {
			return false;
		}
		if (maze[x][y] == 1) {
			return false;
		}
		if (containGrid(openList, x, y) || containGrid(closeList, x, y)) {
			return false;
		}
		return true;
	}

	private static boolean containGrid(ArrayList<Grid> grids, int x, int y) {
		for (Grid n : grids) {
			if ((n.x == x) && (n.y == y)) {
				return true;
			}
		}
		return false;
	}
}