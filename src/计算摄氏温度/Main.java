package 计算摄氏温度;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("Celsius = " + 5*(num-32)/9);
	}

}
