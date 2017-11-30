package 打印沙漏;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str = scanner.next();
		scanner.close();
		int d = 1;
		int sum = 1;
		int more = 0;
		while (sum+(d+2)*2 <= n) {
			d += 2;
			sum += (d*2);
		}
		more = n - sum;
		for (int i = 0; i < d; i++) {
			if (i < d/2+1) {
				for (int j = 0; j < (d-(d-2*i))/2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < d-2*i; j++) {
					System.out.print(str);
				}
				for (int j = 0; j < (d-(d-2*i))/2; j++) {
					System.out.print(" ");
				}
			}else{
				for (int j = 0; j < (d-( 3+2*(i-(d/2+1))) )/2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < ( 3+2*(i-(d/2+1)) ); j++) {
					System.out.print(str);
				}
				for (int j = 0; j < (d-( 3+2*(i-(d/2+1))) )/2; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println(more);
		
		
	}
}
