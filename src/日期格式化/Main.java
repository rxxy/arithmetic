package 日期格式化;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		String[] split = line.split("-");
		System.out.println(split[2] + "-" + split[0] + "-" + split[1]);
	}

}
