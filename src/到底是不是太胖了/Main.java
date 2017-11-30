package 到底是不是太胖了;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] h = new int[count];
		int[] w = new int[count];
		for (int i = 0; i < count; i++) {
			h[i] = scanner.nextInt();
			w[i] = scanner.nextInt();
		}
		scanner.close();
		for (int i = 0; i < count; i++) {
			double perfectWeight = perfectWeight(h[i]);
			double a = Math.abs(perfectWeight - w[i]);
			if (a < perfectWeight * 0.1) {
				System.out.println("You are wan mei!");
				continue;
			}
			if(w[i] < perfectWeight){
				System.out.println("You are tai shou le!");
			}else if(w[i] > perfectWeight){
				System.out.println("You are tai pang le!");
			}
		}
		
		
	}
	
	private static double perfectWeight(int height){
		return (height-100)*0.9*2;
	}
	
}
