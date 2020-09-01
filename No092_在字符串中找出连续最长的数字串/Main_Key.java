
package No092_在字符串中找出连续最长的数字串;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_Key {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.next();
			String[] divided = input.split("[^0-9]");
			Map<Integer, List<String>> result = Stream.of(divided).collect(Collectors.groupingBy(String::length));
			List<Integer> keyList = result.keySet().stream().sorted(Integer::compareTo).collect(Collectors.toList());
			int maxLength = keyList.get(keyList.size() - 1);
			List<String> maxLengthStrings = result.get(maxLength);
			System.out.println(String.join("", maxLengthStrings) + "," + maxLength);
		}
	}
}