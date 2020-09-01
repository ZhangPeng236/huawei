package No042_—ß”¢”Ô;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLong()) {
			long num = scanner.nextLong();
			System.out.println(parse(num));
		}
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

		String string = "";

		if (num9 != 0 || num8 != 0 || num7 != 0) {
			string += getThree(num9, num8, num7);
			string += " million";
			if (num6 != 0 || num5 != 0 && num4 != 0) {
				string += " ";
				string += getThree(num6, num5, num4);
				string += " thousand";
				if (num3 != 0) {
					string += " ";
					string += getThree(num3, num2, num1);
				} else {
					if (num2 != 0 || num1 != 0) {
						string += " ";
						string += getThree(num3, num2, num1);
					}
				}
			} else {
				if (num3 != 0) {
					string += " ";
					string += getThree(num3, num2, num1);
				} else if (num2 != 0 || num1 != 0) {
					string += " and ";
					string += getThree(num3, num2, num1);
				}
			}
		} else if (num6 != 0 || num5 != 0 || num4 != 0) {
			string += getThree(num6, num5, num4);
			string += " thousand";
			if (num3 != 0) {
				string += " ";
				string += getThree(num3, num2, num1);
			} else if (num2 != 0 || num1 != 0) {
				string += " and ";
				string += getThree(num3, num2, num1);
			}
		} else if (num3 != 0 || num2 != 0 || num1 != 0) {
			string += getThree(num3, num2, num1);
		} else {
			string = "zero";
		}
		return string;
	}

	public static String getThree(int num3, int num2, int num1) {
		String[] numGe = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] numTen = { "ten", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String[] numShi = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		String string = "";

		if (num2 == 0) {
			if (num1 != 0) {
				string += numGe[num1];
			}
		} else if (num2 == 1) {
			string += numTen[num1];
		} else {
			string += numShi[num2];
			if (num1 != 0) {
				string += " ";
				string += numGe[num1];
			}
		}

		if (num3 != 0) {
			String temp = string;
			string = numGe[num3] + " hundred";
			if (!(num2 == 0 && num1 == 0)) {
				string += " and " + temp;
			}
		}

		return string;
	}
}