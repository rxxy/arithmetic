package 考试座位号;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bufr.readLine());
		
		String[] id = new String[count];
		int[] testId = new int[count];
		int[] examId = new int[count];
		
		for (int i = 0; i < count; i++) {
			String line = bufr.readLine();
			String[] items = line.split(" ");
			id[i] = items[0];
			testId[i] = Integer.parseInt(items[1]);
			examId[i] = Integer.parseInt(items[2]);
		}
		int selectCount = Integer.parseInt(bufr.readLine());
		int[] selectArray = new int[selectCount];
		String line = bufr.readLine();
		String[] items = line.split(" ");
		for (int i = 0; i < selectCount; i++) {
			selectArray[i] = Integer.parseInt(items[i]);
			for (int j = 0; j < examId.length; j++) {
				if (selectArray[i] == testId[j]) {
					System.out.println(id[j] + " " + examId[j]);
					break;
				}
			}
		}
		bufr.close();
		
	}

}
