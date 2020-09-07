package No044_Sudoku;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int[][] sudoku = new int[9][9];
			for (int i = 0; i < 9; i++) {
				String i9 = scanner.nextLine();
				String[] i9s = i9.split(" ");
				for (int j = 0; j < 9; j++) {
					sudoku[i][j] = Integer.valueOf(i9s[j]);
				}
			}
			if (dfs(sudoku)) {
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 8; j++) {
						System.out.print(sudoku[i][j] + " ");
					}
					System.out.println(sudoku[i][8]);
				}
			}
		}
		scanner.close();
	}

	private static boolean dfs(int[][] sudoku) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (sudoku[i][j] == 0) {
					for (int n = 1; n <= 9; n++) {
						if (isValid(sudoku, i, j, n)) {
							sudoku[i][j] = n;
							if (dfs(sudoku)) {
								return true;
							}
							sudoku[i][j] = 0;
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isValid(int[][] sudoku, int row, int col, int n) {
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][col] == n) {
				return false;
			}
			if (sudoku[row][i] == n) {
				return false;
			}
			if (sudoku[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == n) {
				return false;
			}
		}
		return true;
	}
}