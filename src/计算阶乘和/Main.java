package 计算阶乘和;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += jiecheng(i);
		}
		System.out.println(sum);
		
	}

	private static int jiecheng(int i) {
		if (i == 1) {
			return 1;
		}
		return jiecheng(i - 1) * i;
	}
	
	

}
