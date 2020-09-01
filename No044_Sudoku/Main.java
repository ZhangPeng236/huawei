package No044_Sudoku;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String line0 = scanner.nextLine();
			String line1 = scanner.nextLine();
			String line2 = scanner.nextLine();
			String line3 = scanner.nextLine();
			String line4 = scanner.nextLine();
			String line5 = scanner.nextLine();
			String line6 = scanner.nextLine();
			String line7 = scanner.nextLine();
			String line8 = scanner.nextLine();

			int[][] soDoKu = new int[9][9];
			for (int i = 0; i < 9; i++) {
				soDoKu[0][i] = Integer.valueOf(line0.split(" ")[i]);
				soDoKu[1][i] = Integer.valueOf(line1.split(" ")[i]);
				soDoKu[2][i] = Integer.valueOf(line2.split(" ")[i]);
				soDoKu[3][i] = Integer.valueOf(line3.split(" ")[i]);
				soDoKu[4][i] = Integer.valueOf(line4.split(" ")[i]);
				soDoKu[5][i] = Integer.valueOf(line5.split(" ")[i]);
				soDoKu[6][i] = Integer.valueOf(line6.split(" ")[i]);
				soDoKu[7][i] = Integer.valueOf(line7.split(" ")[i]);
				soDoKu[8][i] = Integer.valueOf(line8.split(" ")[i]);
			}

			while (!binGo(soDoKu)) {
				toTry(soDoKu);
			}

			if (binGo(soDoKu)) {
				print(soDoKu);
			}
		}
	}

	public static ArrayList<Integer> toArrayListLn(int n, int[][] soDoKu) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			arrayList.add(soDoKu[n][i]);
		}
		return arrayList;
	}

	public static ArrayList<Integer> toArrayListCn(int n, int[][] soDoKu) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			arrayList.add(soDoKu[i][n]);
		}
		return arrayList;
	}

	public static ArrayList<Integer> toArrayListBn(int n, int[][] soDoKu) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(soDoKu[n / 3 * 3][n % 3 * 3]);
		arrayList.add(soDoKu[n / 3 * 3][n % 3 * 3 + 1]);
		arrayList.add(soDoKu[n / 3 * 3][n % 3 * 3 + 2]);
		arrayList.add(soDoKu[n / 3 * 3 + 1][n % 3 * 3]);
		arrayList.add(soDoKu[n / 3 * 3 + 1][n % 3 * 3 + 1]);
		arrayList.add(soDoKu[n / 3 * 3 + 1][n % 3 * 3 + 2]);
		arrayList.add(soDoKu[n / 3 * 3 + 2][n % 3 * 3]);
		arrayList.add(soDoKu[n / 3 * 3 + 2][n % 3 * 3 + 1]);
		arrayList.add(soDoKu[n / 3 * 3 + 2][n % 3 * 3 + 2]);
		return arrayList;
	}

	public static boolean binGo(int[][] soDoKu) {
		boolean flag = true;
		ArrayList<Integer> l0 = toArrayListLn(0, soDoKu);
		ArrayList<Integer> l1 = toArrayListLn(1, soDoKu);
		ArrayList<Integer> l2 = toArrayListLn(2, soDoKu);
		ArrayList<Integer> l3 = toArrayListLn(3, soDoKu);
		ArrayList<Integer> l4 = toArrayListLn(4, soDoKu);
		ArrayList<Integer> l5 = toArrayListLn(5, soDoKu);
		ArrayList<Integer> l6 = toArrayListLn(6, soDoKu);
		ArrayList<Integer> l7 = toArrayListLn(7, soDoKu);
		ArrayList<Integer> l8 = toArrayListLn(8, soDoKu);
		ArrayList<Integer> c0 = toArrayListCn(0, soDoKu);
		ArrayList<Integer> c1 = toArrayListCn(1, soDoKu);
		ArrayList<Integer> c2 = toArrayListCn(2, soDoKu);
		ArrayList<Integer> c3 = toArrayListCn(3, soDoKu);
		ArrayList<Integer> c4 = toArrayListCn(4, soDoKu);
		ArrayList<Integer> c5 = toArrayListCn(5, soDoKu);
		ArrayList<Integer> c6 = toArrayListCn(6, soDoKu);
		ArrayList<Integer> c7 = toArrayListCn(7, soDoKu);
		ArrayList<Integer> c8 = toArrayListCn(8, soDoKu);
		ArrayList<Integer> b0 = toArrayListBn(0, soDoKu);
		ArrayList<Integer> b1 = toArrayListBn(1, soDoKu);
		ArrayList<Integer> b2 = toArrayListBn(2, soDoKu);
		ArrayList<Integer> b3 = toArrayListBn(3, soDoKu);
		ArrayList<Integer> b4 = toArrayListBn(4, soDoKu);
		ArrayList<Integer> b5 = toArrayListBn(5, soDoKu);
		ArrayList<Integer> b6 = toArrayListBn(6, soDoKu);
		ArrayList<Integer> b7 = toArrayListBn(7, soDoKu);
		ArrayList<Integer> b8 = toArrayListBn(8, soDoKu);
		for (int i = 1; i <= 9; i++) {
			if (!l0.contains(i) || !l1.contains(i) || !l2.contains(i) || !l3.contains(i) || !l4.contains(i)
					|| !l5.contains(i) || !l6.contains(i) || !l7.contains(i) || !l8.contains(i) || !c0.contains(i)
					|| !c1.contains(i) || !c2.contains(i) || !c3.contains(i) || !c4.contains(i) || !c5.contains(i)
					|| !c6.contains(i) || !c7.contains(i) || !c8.contains(i) || !b0.contains(i) || !b1.contains(i)
					|| !b2.contains(i) || !b3.contains(i) || !b4.contains(i) || !b5.contains(i) || !b6.contains(i)
					|| !b7.contains(i) || !b8.contains(i)) {
				flag = false;
			}
		}
		return flag;
	}

	public static TreeSet<Integer> possibleNumber(int x, int y, int[][] soDoKu) {
		ArrayList<Integer> l = toArrayListLn(x, soDoKu);
		ArrayList<Integer> c = toArrayListCn(y, soDoKu);
		ArrayList<Integer> b = toArrayListBn((x / 3 * 3 + y / 3 * 3), soDoKu);
		TreeSet<Integer> ts = new TreeSet<>();

		for (int i = 1; i <= 9; i++) {
			if (!l.contains(i) && !c.contains(i) && !b.contains(i)) {
				ts.add(i);
			}
		}
		return ts;
	}

	public static void toTry(int[][] soDoKu) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (soDoKu[i][j] == 0) {
					TreeSet<Integer> ts = possibleNumber(i, j, soDoKu);
					if (!ts.isEmpty()) {
						for (Integer integer : ts) {
							soDoKu[i][j] = integer;
							if (binGo(soDoKu)) {
//									System.out.println("尝试成功");
							} else {
								toTry(soDoKu);
							}
						}
					} else {
//							System.out.println("此题无解");
					}

				}
			}
		}
	}

	public static void print(int[][] soDoKu) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 8) {
					System.out.print(soDoKu[i][j]);
				} else {
					System.out.print(soDoKu[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}