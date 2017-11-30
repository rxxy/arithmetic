package 计算指数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zhishu = scanner.nextInt();
		scanner.close();
		System.out.println("2^" + zhishu + " = " + (int)Math.pow(2, zhishu));
		
	}

}
