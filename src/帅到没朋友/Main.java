package 帅到没朋友;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			int lineCount = scanner.nextInt();
			if (lineCount > 1) {
				for (int j = 0; j < lineCount; j++) {
						list.add(scanner.next());
				}
			}else{
				for (int j = 0; j < lineCount; j++) {
					scanner.next();
				}
			}
		}
		int selectCount = scanner.nextInt();
		Set<String> ts = new LinkedHashSet<>();
		for (int i = 0; i < selectCount; i++) {
			ts.add(scanner.next());
		}
		scanner.close();
		boolean flag = false;
		int j = 0;
		Iterator<String> iterator = ts.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (!list.contains(str)) {
				flag = true;
				if (j++ != 0) {
					System.out.print(" ");
				}
				System.out.print(str);
			}
		}
		if (!flag) {
			System.out.println("No one is handsome");
		}
		
	}

}
