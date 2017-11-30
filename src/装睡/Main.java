package 装睡;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = Integer.parseInt(scanner.nextLine());
		List<String> result = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			String line = scanner.nextLine();
			String[] items = line.split(" ");
			int a = Integer.parseInt(items[1]);
			int b = Integer.parseInt(items[2]);
			if ( !(a >= 15 && a <= 20) ) {
				result.add(items[0]);
			}else if( !(b >= 50 && b <= 70) ){
				result.add(items[0]);
			}
		}
		scanner.close();
		for (String string : result) {
			System.out.println(string);
		}
	}

}
