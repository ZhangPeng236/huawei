package No103_RedraimentµÄ×ß·¨;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			int[] pInput = new int[num];
			for (int i = 0; i < num; i++) {
				pInput[i] = scanner.nextInt();
			}
			List<Integer> pResult = new ArrayList<Integer>();
			System.out.println(getResult(num, pInput, pResult));
		}
		scanner.close();
	}

	static int getResult(int num, int[] pInput, List<Integer> pResult) {
		int[] dp = new int[num];
		for (int i = 0; i < num; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (pInput[j] < pInput[i] && dp[j] > max) {
					max = dp[j];
				}
			}
			dp[i] = max + 1;
		}
		Arrays.sort(dp);
		pResult.add(dp[num - 1]);
		return pResult.get(0);
	}
}