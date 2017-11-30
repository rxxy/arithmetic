package 念数字;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		scanner.close();
		Map<String, String> map = new HashMap<String, String>();
		map.put("0","ling");
		map.put("1","yi");
		map.put("2","er");
		map.put("3","san");
		map.put("4","si");
		map.put("5","wu");
		map.put("6","liu");
		map.put("7","qi");
		map.put("8","ba");
		map.put("9","jiu");
		map.put("-","fu");
		
		for (int i = 0; i < num.length(); i++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print( map.get(num.charAt(i) + "") );
		}
		
		
	}

}
