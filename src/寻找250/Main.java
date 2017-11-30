package 寻找250;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		String[] nums = line.split(" ");
		List<String> list = Arrays.asList(nums);
		int index = list.indexOf("250");
		System.out.println(index + 1);
	}

}
