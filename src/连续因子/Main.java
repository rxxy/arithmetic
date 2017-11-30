package 连续因子;

import java.util.Scanner;

public class Main {
	static int num = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		int n = num;
		int start = 2;
		int maxLongStart = 2;
		int maxLongEnd = 0;
		int maxLongCount = 0;
		for (int i = 2; i <= Math.sqrt(num)+1; i++) {
			if (n % i == 0) {
				n /= i;
			}else{
				if (i - start > maxLongCount) {
					maxLongStart = start;
					maxLongEnd = i-1;
					maxLongCount = i - start;
				}
				i = start++;
				n = num;
			}
		}
		print(maxLongStart,maxLongEnd);
		
	}

	private static void print(int i, int j) {
		if (i > j) {
			System.out.println(1);
			System.out.println(num);
			return;
		}
		System.out.println(j-i+1);
		
		for (int i2 = i; i2 <= j; i2++) {
			if (i2 != i) {
				System.out.print("*");
			}
			System.out.print(i2);
		}
	}

}
