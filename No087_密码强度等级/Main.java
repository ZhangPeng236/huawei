package No087_密码强度等级;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String pPasswordStr = scanner.next();
			getPwdSecurityLevel(pPasswordStr);
		}
		scanner.close();
	}

	public static void getPwdSecurityLevel(String pPasswordStr) {
		int score = 0;
		// 一、密码长度:
		if (pPasswordStr.length() <= 4) {
			score += 5;
		} else if (pPasswordStr.length() <= 7) {
			score += 10;
		} else {
			score += 25;
		}
		int big = 0;
		int small = 0;
		int dig = 0;
		int other = 0;
		for (int i = 0; i < pPasswordStr.length(); i++) {
			if (pPasswordStr.charAt(i) >= 'A' && pPasswordStr.charAt(i) <= 'Z') {
				big++;
			} else if (pPasswordStr.charAt(i) >= 'a' && pPasswordStr.charAt(i) <= 'z') {
				small++;
			} else if (pPasswordStr.charAt(i) >= '0' && pPasswordStr.charAt(i) <= '9') {
				dig++;
			} else {
				other++;
			}
		}
		// 二、字母:
		if (big == 0 && small == 0) {
			score += 0;
		} else if (big == 0 || small == 0) {
			score += 10;
		} else {
			score += 20;
		}
		// 三、数字:
		if (dig == 0) {
			score += 0;
		} else if (dig == 1) {
			score += 10;
		} else {
			score += 20;
		}
		// 四、符号:
		if (other == 0) {
			score += 0;
		} else if (other == 1) {
			score += 10;
		} else {
			score += 25;
		}
		// 五、奖励:
		if (other == 0 && dig > 0 && big + small > 0) {
			score += 2;
		} else if (other > 0 && dig > 0 && big + small > 0 && (big == 0 || small == 0)) {
			score += 3;
		} else if (other > 0 && dig > 0 && big > 0 && small > 0) {
			score += 5;
		}
		// 最后的评分标准:
		if (score >= 90) {
			System.out.println("VERY_SECURE");
		} else if (score >= 80) {
			System.out.println("SECURE");
		} else if (score >= 70) {
			System.out.println("VERY_STRONG");
		} else if (score >= 60) {
			System.out.println("STRONG");
		} else if (score >= 50) {
			System.out.println("AVERAGE");
		} else if (score >= 25) {
			System.out.println("WEAK");
		} else {
			System.out.println("VERY_WEAK");
		}
	}
}