package No094_¼ÆÆ±Í³¼Æ;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int backupNum = Integer.valueOf(scanner.next());
			LinkedHashSet<String> backup = new LinkedHashSet<String>();
			LinkedHashMap<String, Integer> vote = new LinkedHashMap<String, Integer>();
			for (int i = 0; i < backupNum; i++) {
				String name = scanner.next();
				backup.add(name);
				vote.put(name, 0);
			}
			int voteNum = Integer.valueOf(scanner.next());
			for (int i = 0; i < voteNum; i++) {
				String temp = scanner.next();
				if (backup.contains(temp)) {
					vote.put(temp, vote.get(temp) + 1);
				}
			}
			Set<String> set = vote.keySet();
			int invalid = voteNum;
			for (String s : set) {
				System.out.println(s + " : " + vote.get(s));
				invalid -= vote.get(s);
			}
			System.out.println("Invalid : " + invalid);
		}
	}
}