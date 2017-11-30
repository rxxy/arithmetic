package 点赞;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < count; i++) {
			int lineCount = scanner.nextInt();
			for (int j = 0; j < lineCount; j++) {
				String key = scanner.next();
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + 1);
				}else{
					map.put(key, 1);
				}
			}
			
		}
		scanner.close();
		Set<String> keys = map.keySet();
		String maxKey = "";
		int maxCount = 0;
		for (String key : keys) {
			if (map.get(key) > maxCount) {
				maxCount = map.get(key);
				maxKey = key;
			}else if(map.get(key).equals(maxCount) ){
				int max = Math.max(Integer.parseInt(key), Integer.parseInt(maxKey));
				maxKey = max + "";
			}
		}
		System.out.println(maxKey + " " + maxCount);
	}

}

