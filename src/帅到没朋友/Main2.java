package 帅到没朋友;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(bufr.readLine());
		int[] data = new int[100010];
		for (int i = 0; i < count; i++) {
			String[] items = bufr.readLine().split(" ");
			int lineCount = Integer.parseInt(items[0]);
			if (lineCount > 1) {
				for (int j = 0; j < lineCount; j++) {
					data[Integer.parseInt(items[j+1])] = 1;
				}
			}
		}
		int selectCount = Integer.parseInt(bufr.readLine());
		
		String[] items = bufr.readLine().split(" ");
		
		bufr.close();
		
		
		
		int j = 0;
		for (int i = 0; i < selectCount; i++) {
			int index = Integer.parseInt(items[i]);
			if ( 0 == data[index]) {
				if (j != 0) {
					System.out.print(" ");
				}
				System.out.print(index);
				data[index] = 1;
				j++;
			}
		}
		if (j == 0) {
			System.out.println("No one is handsome");
		}
	}

}
