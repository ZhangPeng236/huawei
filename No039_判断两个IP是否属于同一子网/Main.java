package No039_判断两个IP是否属于同一子网;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String mask = scanner.nextLine();
			String ip1 = scanner.nextLine();
			String ip2 = scanner.nextLine();
			System.out.println(checkNetSegment(mask, ip1, ip2));
		}
		scanner.close();
	}

	public static int checkNetSegment(String mask, String ip1, String ip2) {
		String[] masks = mask.split("\\.");
		String[] ip1s = ip1.split("\\.");
		String[] ip2s = ip2.split("\\.");

		if (!(mask.equals("0.0.0.0") || mask.equals("128.0.0.0") || mask.equals("192.0.0.0") || mask.equals("224.0.0.0")
				|| mask.equals("240.0.0.0") || mask.equals("248.0.0.0") || mask.equals("252.0.0.0")
				|| mask.equals("254.0.0.0") || mask.equals("255.0.0.0") || mask.equals("255.128.0.0")
				|| mask.equals("255.192.0.0") || mask.equals("255.224.0.0") || mask.equals("255.240.0.0")
				|| mask.equals("255.248.0.0") || mask.equals("255.252.0.0") || mask.equals("255.254.0.0")
				|| mask.equals("255.255.0.0") || mask.equals("255.255.128.0") || mask.equals("255.255.192.0")
				|| mask.equals("255.255.224.0") || mask.equals("255.255.240.0") || mask.equals("255.255.248.0")
				|| mask.equals("255.255.252.0") || mask.equals("255.255.254.0") || mask.equals("255.255.255.0")
				|| mask.equals("255.255.255.128") || mask.equals("255.255.255.192") || mask.equals("255.255.255.224")
				|| mask.equals("255.255.255.240") || mask.equals("255.255.255.248") || mask.equals("255.255.255.252")
				|| mask.equals("255.255.255.254") || mask.equals("255.255.255.255"))) {
			return 1;
		} else if (ip1s.length != 4 || ip2s.length != 4) {
			return 1;
		} else {
			for (int i = 0; i < 4; i++) {
				if (Integer.valueOf(ip1s[i]) < 0 || Integer.valueOf(ip1s[i]) > 255 || Integer.valueOf(ip2s[i]) < 0
						|| Integer.valueOf(ip2s[i]) > 255) {
					return 1;
				}
			}
			for (int i = 0; i < 4; i++) {
				if ((Integer.valueOf(masks[i]) & Integer.valueOf(ip1s[i])) != (Integer.valueOf(masks[i])
						& Integer.valueOf(ip2s[i]))) {
					return 2;
				}
			}
			return 0;
		}
	}
}