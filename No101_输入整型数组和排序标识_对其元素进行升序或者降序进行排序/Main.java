package No101_输入整型数组和排序标识_对其元素进行升序或者降序进行排序;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			Integer[] pIntegerArray = new Integer[num];
			for (int i = 0; i < num; i++) {
				pIntegerArray[i] = scanner.nextInt();
			}
			int iSortFlag = scanner.nextInt();
			sortIntegerArray(pIntegerArray, iSortFlag);
		}
		scanner.close();
	}

	static void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag) {
		Arrays.sort(pIntegerArray);
		if (iSortFlag == 0) {
			for (int i = 0; i < pIntegerArray.length - 1; i++) {
				System.out.print(pIntegerArray[i] + " ");
			}
			System.out.println(pIntegerArray[pIntegerArray.length - 1]);
		} else if (iSortFlag == 1) {
			for (int i = pIntegerArray.length - 1; i > 0; i--) {
				System.out.print(pIntegerArray[i] + " ");
			}
			System.out.println(pIntegerArray[0]);
		}
	}
}