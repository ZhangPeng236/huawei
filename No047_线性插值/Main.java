package No047_œﬂ–‘≤Â÷µ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			int[][] num = new int[m][2];
			for (int i = 0; i < m; i++) {
				num[i][0] = scanner.nextInt();
				num[i][1] = scanner.nextInt();
			}
			int lastNO = num[0][0];
			int lastData = num[0][1];
			System.out.println(lastNO + " " + lastData);
			for (int i = 1; i < m; i++) {
				int nowNO = num[i][0];
				int nowData = num[i][1];
				if (nowNO - lastNO != 0) {
					for (int j = lastNO + 1; j < nowNO; j++) {
						System.out
								.println(j + " " + (lastData + (nowData - lastData) / (nowNO - lastNO) * (j - lastNO)));
					}
					System.out.println(nowNO + " " + nowData);
					lastNO = nowNO;
					lastData = nowData;
				}
			}
		}
		scanner.close();
	}
}