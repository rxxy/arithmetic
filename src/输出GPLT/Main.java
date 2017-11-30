package 输出GPLT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		String line = bufr.readLine();
		
		Pattern pattern = Pattern.compile("[^G|P|L|T|g|p|l|t]");
		Matcher matcher = pattern.matcher(line);
		String str = matcher.replaceAll("").toUpperCase();
		
		int g = 0;
		int p = 0;
		int l = 0;
		int t = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch(c){
				case 'G':
					g++;
					break;
				case 'P':
					p++;
					break;
				case 'L':
					l++;
					break;
				case 'T':
					t++;
					break;
			}
		}
		while ((g|p|l|t) != 0) {
			if (g > 0) {
				g--;
				System.out.print("G");
			}
			if (p > 0) {
				p--;
				System.out.print("P");
			}
			if (l > 0) {
				l--;
				System.out.print("L");
			}
			if (t > 0) {
				t--;
				System.out.print("T");
			}
			
		}
	}

}

