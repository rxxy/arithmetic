package 谁先倒;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		int[] aSay = new int[n];
		int[] aDo = new int[n];
		int[] bSay = new int[n];
		int[] bDo = new int[n];
		
		for (int i = 0; i < n; i++) {
			aSay[i] = scanner.nextInt();
			aDo[i] = scanner.nextInt();
			bSay[i] = scanner.nextInt();
			bDo[i] = scanner.nextInt();
		}
		scanner.close();
		int aDrinkCount = 0;
		int bDrinkCount = 0;
		for (int i = 0; i < n && (aDrinkCount <= a && bDrinkCount <= b); i++) {
			boolean aWin = aSay[i] + bSay[i] == bDo[i];
			boolean bWin = aSay[i] + bSay[i] == aDo[i];
			if ( (aWin!=bWin) && (aWin|bWin)) {
				if (bWin) {
					aDrinkCount++;
				}else if(aWin){
					bDrinkCount++;
				}
			}
		}
		if (aDrinkCount > a) {
			System.out.println("A");
			System.out.println(bDrinkCount);
		}else{
			System.out.println("B");
			System.out.println(aDrinkCount);
		}
		
		
	}

}
