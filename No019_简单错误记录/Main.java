package No019_¼òµ¥´íÎó¼ÇÂ¼;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		while (scanner.hasNextLine()) {
			String src = scanner.nextLine();
			String fileName = src.split("\\s+")[0];
			String lineNumber = src.split("\\s+")[1];
			String name = fileName.substring(fileName.lastIndexOf('\\') + 1);
			name = name.length() > 16 ? name.substring(name.length() - 16) : name;
			if (!lhm.containsKey(name + " " + lineNumber)) {
				lhm.put(name + " " + lineNumber, 1);
			} else {
				lhm.put(name + " " + lineNumber, lhm.get(name + " " + lineNumber) + 1);
			}
		}
		Set<String> set = lhm.keySet();
		int i = 0;
		for (String s : set) {
			if (set.size() - i <= 8) {
				System.out.println(s + " " + lhm.get(s));
			}
			i++;
		}
		scanner.close();
	}
}