package No042_Ñ§Ó¢Óï;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLong()) {
			long num = scanner.nextLong();
			System.out.println(parse(num));
		}
		scanner.close();
	}

	public static String parse(long num) {
		int num1 = (int) (num % 10);
		int num2 = (int) (num / 10 % 10);
		int num3 = (int) (num / 100 % 10);
		int num4 = (int) (num / 1000 % 10);
		int num5 = (int) (num / 10000 % 10);
		int num6 = (int) (num / 100000 % 10);
		int num7 = (int) (num / 1000000 % 10);
		int num8 = (int) (num / 10000000 % 10);
		int num9 = (int) (num / 100000000 % 10);

		StringBuilder result = new StringBuilder();

		if (num9 != 0 || num8 != 0 || num7 != 0) {
			result.append(getThree(num9, num8, num7)).append(" million");
			if (num6 != 0 || num5 != 0 && num4 != 0) {
				result.append(" ").append(getThree(num6, num5, num4)).append(" thousand");
				if (num3 != 0 || num2 != 0 || num1 != 0) {
					result.append(" ").append(getThree(num3, num2, num1));
				}
			} else {
				if (num3 != 0) {
					result.append(" ").append(getThree(num3, num2, num1));
				} else if (num2 != 0 || num1 != 0) {
					result.append(" and ").append(getThree(num3, num2, num1));
				}
			}
		} else if (num6 != 0 || num5 != 0 || num4 != 0) {
			result.append(getThree(num6, num5, num4)).append(" thousand");
			if (num3 != 0) {
				result.append(" ").append(getThree(num3, num2, num1));
			} else if (num2 != 0 || num1 != 0) {
				result.append(" and ").append(getThree(num3, num2, num1));
			}
		} else if (num3 != 0 || num2 != 0 || num1 != 0) {
			result.append(getThree(num3, num2, num1));
		} else {
			result.append("zero");
		}
		return result.toString();
	}

	public static String getThree(int num3, int num2, int num1) {
		String[] numGe = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] numTen = { "ten", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String[] numShi = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		StringBuilder string = new StringBuilder();
		if (num3 != 0) {
			string.append(numGe[num3]).append(" hundred");
			if (num2 != 0 || num1 != 0) {
				string.append(" and ");
				if (num2 == 0) {
					string.append(numGe[num1]);
				} else if (num2 == 1) {
					string.append(numTen[num1]);
				} else {
					string.append(numShi[num2]);
					if (num1 != 0) {
						string.append(" ").append(numGe[num1]);
					}
				}
			}
		} else {
			if (num2 == 0) {
				if (num1 != 0) {
					string.append(numGe[num1]);
				}
			} else if (num2 == 1) {
				string.append(numTen[num1]);
			} else {
				string.append(numShi[num2]);
				if (num1 != 0) {
					string.append(" ").append(numGe[num1]);
				}
			}
		}
		return string.toString();
	}
}