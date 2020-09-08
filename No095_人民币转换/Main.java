package No095_�����ת��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final String[] convert = new String[] { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��", "ʰ", "��",
			"Ǫ", "��", "��" };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while ((str = br.readLine()) != null) {
			if (str.equals(""))
				continue;
			if (str.equals("0.00")) {
				System.out.println("�������Ԫ��");
				continue;
			}
			String[] params = str.split("\\.");
			char[] s = params[0].toCharArray();
			StringBuilder ans = new StringBuilder();
			boolean is_zero = true;
			for (int i = s.length - 1; i >= 0; i--) {
				if (s[i] == '0') {
					if (!is_zero) {
						ans.append(convert[0]);
						is_zero = true;
					}
				} else if (s[i] == '1' && (s.length - 1 - i) % 4 == 1) {
					ans.append(convert[10]);
					is_zero = false;
				} else {
					int temp = (s.length - 1 - i) % 4;
					if (temp == 1)
						ans.append(convert[10]);
					else if (temp == 2)
						ans.append(convert[11]);
					else if (temp == 3)
						ans.append(convert[12]);
					else if (s.length - 1 - i > 0) {
						int pos = ((s.length - 1 - i) / 4) % 2;
						if (pos == 1)
							ans.append(convert[13]);
						else
							ans.append(convert[14]);
					}
					ans.append(convert[s[i] - '0']);
					is_zero = false;
				}
			}
			String res = "�����";
			if (ans.length() != 0)
				res = res + ans.reverse().toString() + "Ԫ";
			if (params[1].equals("00"))
				System.out.println(res + "��");
			else if (params[1].charAt(1) == '0')
				System.out.println(res + convert[params[1].charAt(0) - '0'] + "��");
			else if (params[1].charAt(0) == '0')
				System.out.println(res + convert[params[1].charAt(1) - '0'] + "��");
			else
				System.out.println(
						res + convert[params[1].charAt(0) - '0'] + "��" + convert[params[1].charAt(1) - '0'] + "��");
		}
	}
}