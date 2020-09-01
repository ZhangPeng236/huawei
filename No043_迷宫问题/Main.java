package No043_√‘π¨Œ Ã‚;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String size = scanner.nextLine();
			int N = Integer.valueOf(size.split(" ")[0]);
			int M = Integer.valueOf(size.split(" ")[1]);
			int[][] maze = new int[N][M];
			for (int i = 0; i < M; i++) {
				String line = scanner.nextLine();
				String lines[] = line.split(" ");
				for (int j = 0; j < N; j++) {
					maze[i][j] = Integer.valueOf(lines[j]);
				}
			}

			int startX = 0;
			int stratY = 0;
//			int positionX = 0;
//			int positionY = 0;
			int endX = M - 1;
			int endY = N - 1;
//			String direction = "right";

			ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add("(0,0)");
		}
	}

	public static boolean getEnd(int positionX, int positionY, String direction, int[][] maze, int M, int N) {
		if (direction == "down" && positionX == M - 2 && positionY == N - 1 && maze[positionX][positionY] == 0) {
			return true;
		} else if (direction == "right" && positionX == M - 1 && positionY == N - 1
				&& maze[positionX][positionY] == 0) {
			return true;
		} else {
			return false;
		}
	}

}
