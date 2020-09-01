package No079_×Ö·û´®µÄÏàËÆ¶È;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			int[][] dp = new int[s1.length() + 1][s2.length() + 1];
			for (int i = 0; i <= s1.length(); i++) {
				for (int j = 0; j <= s2.length(); j++) {
					if (i == 0) {
						dp[i][j] = j;
					} else if (j == 0) {
						dp[i][j] = i;
					} else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
						dp[i][j] = dp[i - 1][j - 1];
					} else {
						dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i][j - 1]) + 1;
					}
				}
			}
			String res = "1/";
			res += dp[s1.length()][s2.length()] + 1;
			System.out.println(res);
		}
	}
}