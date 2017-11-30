package 古风排版;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		String line = scanner.nextLine();
		scanner.close();
		int columnCount = line.length()%count==0?line.length()/count:line.length()/count+1;
		char[] row = new char[columnCount];

		for (int k = 0; k < count; k++) {
			for (int j = 0,i = row.length-1; j < line.length() && i >= 0; j+=count,i--) {
				if (j+k >= line.length()) {
					row[i] = ' ';
				}else{
					row[i] = line.charAt(j+k); 
				}
			}
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i]);
			}
			System.out.println();
		}
	}

}
