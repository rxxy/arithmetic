package 到底有多二;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		scanner.close();
		boolean oddFlag = Integer.parseInt(num.charAt(num.length()-1)+"")%2==0?true:false;
		boolean negativeFlag = num.charAt(0)=='-'?true:false;
		int length = negativeFlag?num.length()-1:num.length();
		int twoCount = 0;
		for (int i = 0; i < length; i++) {
			if(num.charAt(i) == '2'){
				twoCount++;
			}
		}
		double result = twoCount/(double)length;
		if (oddFlag) {
			result *= 2;
		}
		if (negativeFlag) {
			result *= 1.5;
		}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(result*100) + "%");
	}

}
