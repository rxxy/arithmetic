package 求整数段和;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		scanner.close();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if ((start-i)!=0 && (start-i) % 5 == 0) {
				System.out.println();
			}
			sum += i;
			System.out.printf("%5d", i);
		}
		System.out.println();
		System.out.println("Sum = " + sum);
		
	}

}
