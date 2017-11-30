package 查验身份证;

import java.util.Scanner;
/**
 * 提交不提交汉字哈哈哈，jdk1.6不识别汉字
 * @author rxxy
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String[] input = new String[count];
		for (int i = 0; i < count; i++) {
			input[i] = scanner.next();
		}
		scanner.close();
		boolean[] result = new boolean[count];
		for (int i = 0; i < count; i++) {
			result[i] = check(input[i]);
		}
		boolean allPass = true;
		for (int i = 0; i < count; i++) {
			if (!result[i]) {
				allPass = false;
				System.out.println(input[i]);
			}
		}
		if (allPass) {
			System.out.println("All passed");
		}
	}

	private static boolean check(String idStr) {
		boolean flag = false;
		/**
		 * 前17位权重
		 */
		int[] salt = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		char[] checkcode = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
		int sum = 0;
		for (int i = 0; i < 17; i++) {
			int n = 0;
			try{
				n = Integer.parseInt(idStr.charAt(i)+"");
			}catch(NumberFormatException e){
				return false;
			}
			sum += (salt[i] * n );
		}
		if ( checkcode[sum % 11] ==  idStr.charAt(17)  ) {
			flag = true;
		}
		return flag;
	}

}
