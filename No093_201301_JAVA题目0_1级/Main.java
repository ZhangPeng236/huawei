package No093_201301_JAVAÌâÄ¿0_1¼¶;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int[] src = new int[n];
			for (int i = 0; i < n; i++) {
				src[i] = scanner.nextInt();
			}
			System.out.println(result(src));
		}
		scanner.close();
	}

	private static boolean result(int[] src) {
		int sum3 = 0;
		int sum5 = 0;
		int sumo = 0;
		ArrayList<Integer> arrayListo = new ArrayList<Integer>();
		for (int i : src) {
			if (i % 5 == 0) {
				sum5 += i;
			} else if (i % 3 == 0) {
				sum3 += i;
			} else {
				sumo += i;
				arrayListo.add(i);
			}
		}
		if ((sum3 - sum5 + sumo) % 2 != 0) {
			return false;
		} else {
			int sumh = (sum3 - sum5 + sumo) / 2;
			return can(arrayListo, sumh);
		}
	}

	private static boolean can(ArrayList<Integer> arrayListo, int sumh) {
		ArrayList<Integer> sumt = new ArrayList<Integer>();
		sumt.add(0);
		for (Integer i : arrayListo) {
			int size = sumt.size();
			for (int x = 0; x < size; x++) {
				sumt.add(sumt.get(x) + i);
			}
		}
		return sumt.contains(sumh);
	}
}