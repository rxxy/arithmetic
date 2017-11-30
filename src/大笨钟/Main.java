package 大笨钟;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String timeStr = scanner.nextLine();
		scanner.close();

		String[] split = timeStr.split(":");
		
		int h = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		int count = 0;
		if ( !(h>=0 && h<=12)) {
			count = h - 12;
		}else {
			System.out.println("Only " + timeStr + ".  Too early to Dang.");
			return;
		}
		if (m != 0) {
			count++;
		}
		for (int i = 0; i < count; i++) {
			System.out.print("Dang");
		}
		
		
	}

}
