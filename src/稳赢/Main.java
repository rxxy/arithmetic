package 稳赢;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(bufr.readLine());
		String line = bufr.readLine();
		ArrayList<String> al = new ArrayList<>();
		while(!line.equals("End")){
			al.add(line);
			line = bufr.readLine();
		}
		Map<String, String> map = new HashMap<>();
		map.put("Bu", "JianDao");
		map.put("JianDao", "ChuiZi");
		map.put("ChuiZi", "Bu");
		for (int i = 0; i < al.size(); i++) {
			String str = al.get(i);
			if ( (i+1)%(k+1) == 0) {
				System.out.println(str);
			}else{
				System.out.println(map.get(str));
			}
		}
		
		
	}

}
