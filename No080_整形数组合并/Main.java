package No080_整形数组合并;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int array1Num = scanner.nextInt();
			int[] pArray1 = new int[array1Num];
			for (int i = 0; i < array1Num; i++) {
				pArray1[i] = scanner.nextInt();
			}
			int array2Num = scanner.nextInt();
			int[] pArray2 = new int[array2Num];
			for (int i = 0; i < array2Num; i++) {
				pArray2[i] = scanner.nextInt();
			}
			combineBySort(pArray1, array1Num, pArray2, array2Num);
		}
		scanner.close();
	}

	private static void combineBySort(int[] pArray1, int array1Num, int[] pArray2, int array2Num) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i1 : pArray1) {
			ts.add(i1);
		}
		for (int i2 : pArray2) {
			ts.add(i2);
		}
		for (int n : ts) {
			System.out.print(n);
		}
		System.out.println();
	}
}