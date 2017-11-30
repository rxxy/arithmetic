package 个位数统计;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		scanner.close();
		Map<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (map.get(c) == null) {
				map.put(c, 1);
			}else{
				map.put(c, map.get(c) + 1);
			}
		}
		Set<Character> keySet = map.keySet();
		for (Character key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		
	}

}
