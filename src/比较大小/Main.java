package 比较大小;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.sort(nums);
		System.out.println(nums[0] + "->" + nums[1] + "->" + nums[2]);
		String a = "234";
		if ("23".equals(a)) {
			
		}
	}

}
