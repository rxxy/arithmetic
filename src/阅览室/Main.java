package 阅览室;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		List<List<String>> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			String line = scanner.nextLine();
			ArrayList<String> list2 = new ArrayList<>();
			list.add(list2);
			while (!line.startsWith("0")) {
				for (int j = 0; j < list2.size(); j++) {
					String[] items1 = list2.get(j).split(" ");
					String[] items2 = line.split(" ");
					if (items1[0].equals(items2[0]) && items1[1].equals("S") && items2[1].equals("S")) {
						list2.remove(j);
						break;
					}
				}
				list2.add(line);
				line = scanner.nextLine();
			}
		}
		scanner.close();
		for (List<String> list2 : list) {
			int time = 0;
			int borrowCount = 0;
			for (int i = 0; i < list2.size(); i++) {
				if (list2.size() <= 1) {
					break;
				}
				String[] items = list2.get(i).split(" ");
				
				if (!items[1].equals("S")) {
					continue;
				}
				for (int j = i+1; j < list2.size(); j++) {
					String[] items2 = list2.get(j).split(" ");
					if (items[0].equals(items2[0]) && items2[1].equals("E")) {
						String[] dates = items[2].split(":");
						String[] dates2 = items2[2].split(":");
						int diffHour = Integer.parseInt(dates2[0]) - Integer.parseInt(dates[0]);
						int diffMin = Integer.parseInt(dates2[1]) - Integer.parseInt(dates[1]);
						time += (diffHour*60 + diffMin);
						borrowCount++;
					}
					
				}
			}
			if (borrowCount != 0) {
				System.out.println(borrowCount + " " + Math.round(time/(double)borrowCount));
			}else{
				System.out.println(borrowCount + " " + time);
			}
			
			
		}
		
		
		
	}

}
/*
3
1 S 08:10
2 S 08:35
1 E 10:00
2 E 13:16
0 S 17:00
0 S 17:00
3 E 08:10
1 S 08:20
2 S 09:00
1 E 09:20
0 E 17:00
*/