package No018_识别有效的IP地址和掩码并进行分类统计;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * decription:识别有效的IP地址和掩码并进行分类统计
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] count = { 0, 0, 0, 0, 0, 0, 0 }; // 个数数组

		while (scanner.hasNext()) {
			String str = scanner.nextLine();

			String[] strings = str.split("~");
			String ipStr = strings[0]; // ip
			String codeStr = strings[1]; // 掩码

			String[] ipCharStr = ipStr.split("\\.");
			// 判断ip是否为空或者首字符是否等于0
			Boolean isTrue = true;
			int number = Integer.parseInt(ipCharStr[0]);
			if (number == 0)
				continue; // 为0直接跳出本次循环
			else {
				for (int i = 0; i < ipCharStr.length; i++) {
					if (ipCharStr[i].length() <= 0 || ipCharStr[i] == "") {
						isTrue = false;
					}
				}
			}

			// 如果ip地址正确判断掩码是否正确
			if (isTrue) {
				// 判断掩码是否正确
				int[] codeRange = { 254, 252, 248, 240, 224, 192, 128, 0 };
				List<Integer> list = Arrays.stream(codeRange).boxed().collect(Collectors.toList());// int数组转化为list
				String[] codeCharStr = codeStr.split("\\.");

				// 判断是否前面全为1后面全为0
				if ("255".equals(codeCharStr[0])) {
					if ("255".equals(codeCharStr[1])) {
						if ("255".equals(codeCharStr[2])) {
							if ("255".equals(codeCharStr[3])) {
								isTrue = false;
							} else if (list.contains(Integer.parseInt(codeCharStr[3]))) {
								isTrue = true;
							} else
								isTrue = false;
						} else if (list.contains(Integer.parseInt(codeCharStr[2]))) {
							if (Integer.parseInt(codeCharStr[3]) == 0)
								isTrue = true;
							else
								isTrue = false;
						} else
							isTrue = false;
					} else if (list.contains(Integer.parseInt(codeCharStr[1]))) {
						if (Integer.parseInt(codeCharStr[2]) == 0 && Integer.parseInt(codeCharStr[3]) == 0)
							isTrue = true;
						else
							isTrue = false;
					} else
						isTrue = false;
				} else if (list.contains(Integer.parseInt(codeCharStr[0]))) {
					if (Integer.parseInt(codeCharStr[0]) == 0) {
						isTrue = false;
					} else {
						if (Integer.parseInt(codeCharStr[1]) == 0 && Integer.parseInt(codeCharStr[2]) == 0
								&& Integer.parseInt(codeCharStr[3]) == 0)
							isTrue = true;
						else
							isTrue = false;
					}

				} else
					isTrue = false;
			}

			// 调用方法判断地址范围和私网ip
			if (isTrue) {
				int first = Integer.parseInt(ipCharStr[0]);
				int second = Integer.parseInt(ipCharStr[1]);
				count = judgeIp(first, second, count);
			} else {
				count[5]++;
			}
		}

		System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3] + " " + count[4] + " " + count[5]
				+ " " + count[6]);
	}

	// 判断地址范围和私网ip
	public static int[] judgeIp(int first, int second, int[] count) {
		// 判断地址范围
		if (first >= 1 && first <= 126)
			count[0]++;
		else if (first >= 128 && first <= 191)
			count[1]++;
		else if (first >= 192 && first <= 223)
			count[2]++;
		else if (first >= 224 && first <= 239)
			count[3]++;
		else if (first >= 240 && first <= 255)
			count[4]++;

		// 判断私网ip
		if (first == 192 && second == 168)
			count[6]++;
		if (first == 10)
			count[6]++;
		if (first == 172) {
			if (second >= 16 && second <= 31)
				count[6]++;
		}
		return count;
	}
}