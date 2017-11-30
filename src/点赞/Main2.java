package 点赞;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bufr.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < count; i++) {
			String line = bufr.readLine();
			String[] items = line.split(" ");
			int lineCount = Integer.parseInt(items[0]);
			for (int j = 0; j < lineCount; j++) {
				String key = items[j+1];
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + 1);
				}else{
					map.put(key, 1);
				}
			}
			
		}
		bufr.close();
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

