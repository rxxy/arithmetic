package LeftPad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		String str = scanner.nextLine();
		str = str.substring(1);
		String line = scanner.nextLine();
//		System.out.println(len + "--" + str + "--" + line);
		scanner.close();
		if (len < line.length()) {
			System.out.println(line.substring(line.length() - len));
		}else{
			for (int i = 0; i < (len - line.length()); i++) {
				System.out.print(str);
			}
			System.out.println(line);
		}
		
	
	}

}
