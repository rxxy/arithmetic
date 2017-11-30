package 出租;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < line.length(); i++) {
			set.add(Integer.parseInt(line.charAt(i)+""));
		}
		StringBuilder phoneNum = new StringBuilder();
		
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			phoneNum.append(integer + ",");
		}
		String str = phoneNum.reverse().substring(1);

		Integer[] nums = new Integer[set.size()];
		nums = set.toArray(nums);
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		});
		
		String str2 = "";
		for (int i = 0; i < line.length(); i++) {
			int n = Integer.parseInt(line.charAt(i)+"");
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == n) {
					if (i != 0) {
						str2 += ",";
					}
					str2 += j;
					break;
				}
			}
		}
		
		System.out.println(String.format("int[] arr = new int[]{%s};", str));
		System.out.println(String.format("int[] index = new int[]{%s};", str2));
		
	}

}
