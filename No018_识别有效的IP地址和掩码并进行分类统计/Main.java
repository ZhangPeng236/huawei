package No018_ʶ����Ч��IP��ַ�����벢���з���ͳ��;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * decription:ʶ����Ч��IP��ַ�����벢���з���ͳ��
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] count = { 0, 0, 0, 0, 0, 0, 0 }; // ��������

		while (scanner.hasNext()) {
			String str = scanner.nextLine();

			String[] strings = str.split("~");
			String ipStr = strings[0]; // ip
			String codeStr = strings[1]; // ����

			String[] ipCharStr = ipStr.split("\\.");
			// �ж�ip�Ƿ�Ϊ�ջ������ַ��Ƿ����0
			Boolean isTrue = true;
			int number = Integer.parseInt(ipCharStr[0]);
			if (number == 0)
				continue; // Ϊ0ֱ����������ѭ��
			else {
				for (int i = 0; i < ipCharStr.length; i++) {
					if (ipCharStr[i].length() <= 0 || ipCharStr[i] == "") {
						isTrue = false;
					}
				}
			}

			// ���ip��ַ��ȷ�ж������Ƿ���ȷ
			if (isTrue) {
				// �ж������Ƿ���ȷ
				int[] codeRange = { 254, 252, 248, 240, 224, 192, 128, 0 };
				List<Integer> list = Arrays.stream(codeRange).boxed().collect(Collectors.toList());// int����ת��Ϊlist
				String[] codeCharStr = codeStr.split("\\.");

				// �ж��Ƿ�ǰ��ȫΪ1����ȫΪ0
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

			// ���÷����жϵ�ַ��Χ��˽��ip
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

	// �жϵ�ַ��Χ��˽��ip
	public static int[] judgeIp(int first, int second, int[] count) {
		// �жϵ�ַ��Χ
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

		// �ж�˽��ip
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