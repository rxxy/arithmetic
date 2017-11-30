package 考试座位号;

import java.util.Scanner;
/**
 * java会超时，无解，呵呵呵
 * @author rxxy
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String[] id = new String[count];
		int[] testId = new int[count];
		int[] examId = new int[count];
		
		for (int i = 0; i < count; i++) {
			id[i] = scanner.next();
			testId[i] = scanner.nextInt();
			examId[i] = scanner.nextInt();
		}
		int selectCount = scanner.nextInt();
		int[] selectArray = new int[selectCount];
		for (int i = 0; i < selectCount; i++) {
			selectArray[i] = scanner.nextInt();
			for (int j = 0; j < examId.length; j++) {
				if (selectArray[i] == testId[j]) {
					System.out.println(id[j] + " " + examId[j]);
					break;
				}
			}
		}
		scanner.close();
		
	}

}
