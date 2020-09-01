package No033_整数与IP地址间的转换;

import java.util.Scanner;

//遇到的问题，数组越界，输入格式不正确，应都为String输入；
//int型溢出，要换为long型
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String ip = in.nextLine();
			String p = in.nextLine();
			System.out.println(IptoTen(ip));
			TentoIp(p);
		}
	}

	private static void TentoIp(String p) {
		long temp = Long.parseLong(p);
		String ip = Long.toBinaryString(temp);
		StringBuilder sb = new StringBuilder();
		if (ip.length() < 32) {
			for (int i = 0; i < (32 - ip.length()); i++) {
				sb.append(0);
			}
			sb.append(ip);
		} else if (ip.length() == 32) {
			sb.append(ip);
		}
		for (int i = 0; i < sb.length() - 8; i = i + 8) {
			System.out.print(Integer.parseInt(sb.substring(i, i + 8), 2) + ".");
		}
		System.out.println(Integer.parseInt(sb.substring(sb.length() - 8, sb.length()), 2));
	}

	private static long IptoTen(String ip) {
		String[] arr = ip.split("\\.");
		long n = Long.parseLong(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			n = n << 8;
			n = n + Long.parseLong(arr[i]);
		}
		return n;
	}
}