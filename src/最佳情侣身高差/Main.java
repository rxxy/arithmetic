package 最佳情侣身高差;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		double perfectHeight;
		String[] result = new String[count];
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		for (int i = 0; i < count; i++) {
			String sex = scanner.next();
			double height = scanner.nextDouble();
			if (sex.equals("M")) {
				perfectHeight = height/1.09;
			}else{
				perfectHeight = height*1.09;
			}
			result[i] = nf.format(perfectHeight);
		}
		scanner.close();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
