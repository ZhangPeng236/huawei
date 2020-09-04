package No018_识别有效的IP地址和掩码并进行分类统计;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while (scanner.hasNext()) {
			list.add(scanner.nextLine());
		}
		show(list);
		list.clear();
		scanner.close();
	}

	private static void show(ArrayList<String> list) {
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countE = 0;
		int countError = 0;
		int countPrivate = 0;
		for (String src : list) {
			String ip = src.split("~")[0];
			String mask = src.split("~")[1];
			if (ip.split("\\.").length != 4 || mask.split("\\.").length != 4) {
				countError++;
				continue;
			}
			String ip0;
			String ip1;
			String ip2;
			String ip3;
			String mask0;
			String mask1;
			String mask2;
			String mask3;
			try {
				ip0 = Integer.toBinaryString(Integer.valueOf(ip.split("\\.")[0]));
				ip1 = Integer.toBinaryString(Integer.valueOf(ip.split("\\.")[1]));
				ip2 = Integer.toBinaryString(Integer.valueOf(ip.split("\\.")[2]));
				ip3 = Integer.toBinaryString(Integer.valueOf(ip.split("\\.")[3]));
				mask0 = Integer.toBinaryString(Integer.valueOf(mask.split("\\.")[0]));
				mask1 = Integer.toBinaryString(Integer.valueOf(mask.split("\\.")[1]));
				mask2 = Integer.toBinaryString(Integer.valueOf(mask.split("\\.")[2]));
				mask3 = Integer.toBinaryString(Integer.valueOf(mask.split("\\.")[3]));

			} catch (NumberFormatException e) {
				countError++;
				continue;
			}
			ip0 = addZero(ip0);
			ip1 = addZero(ip1);
			ip2 = addZero(ip2);
			ip3 = addZero(ip3);
			mask0 = addZero(mask0);
			mask1 = addZero(mask1);
			mask2 = addZero(mask2);
			mask3 = addZero(mask3);
			long ipAll = Long.valueOf(ip0 + ip1 + ip2 + ip3, 2);
			String maskAll = mask0 + mask1 + mask2 + mask3;
			if (ipAll < 0L || ipAll > 256L * 256L * 256L * 256L - 1L || mask.equals("0.0.0.0")
					|| mask.equals("255.255.255.255") || maskAll.indexOf("0") != maskAll.lastIndexOf("1") + 1) {
				countError++;
			} else if (ipAll >= 256L * 256L * 256L && ipAll <= 127L * 256L * 256L * 256L - 1L) {
				countA++;
				if (ipAll >= 10L * 256L * 256L * 256L && ipAll <= 11L * 256L * 256L * 256L - 1L) {
					countPrivate++;
				}
			} else if (ipAll >= 128L * 256L * 256L * 256L && ipAll <= 192L * 256L * 256L * 256L - 1L) {
				countB++;
				if (ipAll >= (172L * 256L + 16L) * 256L * 256L && ipAll <= (172L * 256L + 32L) * 256L * 256L - 1L) {
					countPrivate++;
				}
			} else if (ipAll >= 192L * 256L * 256L * 256L && ipAll <= 224L * 256L * 256L * 256L - 1L) {
				countC++;
				if (ipAll >= (192L * 256L + 168L) * 256L * 256L && ipAll <= (192L * 256L + 169L) * 256L * 256L - 1L) {
					countPrivate++;
				}
			} else if (ipAll >= 224L * 256L * 256L * 256L && ipAll <= 240L * 256L * 256L * 256L - 1L) {
				countD++;
			} else if (ipAll >= 240L * 256L * 256L * 256L && ipAll <= 256L * 256L * 256L * 256L - 1L) {
				countE++;
			}
		}
		System.out.println(countA + " " + countB + " " + countC + " " + countD + " " + countE + " " + countError + " "
				+ countPrivate);
	}

	private static String addZero(String s) {
		while (s.length() < 8) {
			s = "0" + s;
		}
		return s;
	}
}