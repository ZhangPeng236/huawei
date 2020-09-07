package No033_整数与IP地址间的转换;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String ip = scanner.next();
			long ten = Long.valueOf(scanner.next());
			System.out.println(ip2Ten(ip));
			System.out.println(ten2Ip(ten));
		}
		scanner.close();
	}

	private static long ip2Ten(String ip) {
		String[] ips = ip.split("\\.");
		return Long.valueOf(ips[0]) * 256 * 256 * 256 + Long.valueOf(ips[1]) * 256 * 256 + Long.valueOf(ips[2]) * 256
				+ Long.valueOf(ips[3]);
	}

	private static String ten2Ip(long ten) {
		long ip3 = ten % 256;
		long ip2 = ten / 256 % 256;
		long ip1 = ten / 256 / 256 % 256;
		long ip0 = ten / 256 / 256 / 256 % 256;
		return ip0 + "." + ip1 + "." + ip2 + "." + ip3;
	}
}