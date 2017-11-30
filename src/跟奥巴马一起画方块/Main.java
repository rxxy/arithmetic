package 跟奥巴马一起画方块;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str = scanner.next();
		scanner.close();
		
		for (int i = 0; i < Math.round(n/2.0); i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
		
		
		
	}

}
