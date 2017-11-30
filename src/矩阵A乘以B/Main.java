package 矩阵A乘以B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ra = scanner.nextInt();
		int ca = scanner.nextInt();
		int[][] a = new int[ra][ca];
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		int rb = scanner.nextInt();
		int cb = scanner.nextInt();
		int[][] b = new int[rb][cb];
		for (int i = 0; i < rb; i++) {
			for (int j = 0; j < cb; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		if (ca != rb) {
			System.out.println(ca + " != " + rb);
			return;
		}
		
		int[][] result = new int[ra][cb];
		
		for (int j = 0; j < ra; j++) {
			for (int i = 0; i < cb; i++) {
				int sum = 0;
				for (int k = 0; k < ca; k++) {
					sum += (a[j][k]*b[k][i]);
				}
				result[j][i] = sum;
			}
		}
		
		System.out.println(ra + " " + cb);
		
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				if (j != 0) {
					System.out.print(" ");
				}
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
