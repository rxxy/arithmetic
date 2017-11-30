package 整除光棍;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		BigInteger xbi = new BigInteger(x + "");
		BigInteger yushu = new BigInteger("-1");
		String one = "1";
		BigInteger bi = new BigInteger(one);
		while (!yushu.toString().equals("0")) {
			bi = new BigInteger(one);
			yushu = bi.mod(xbi);
			one += "1";
		}
		BigInteger result = bi.divide(xbi);
		System.out.println(result + " " + bi.toString().length());
		
	}

}
