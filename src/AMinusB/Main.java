package AMinusB;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Console cs = System.console();  
        if (cs == null) {   
            throw new IllegalStateException("canot use console");   
        }   
        String[] items = cs.readLine().split(" ");
        System.out.println(Integer.parseInt(items[0]) * Integer.parseInt(items[1]));  
		
		
		
		
		
//		StringBuilder patternStr = new StringBuilder();
//		for (int i = 0; i < b.length(); i++) {
//			patternStr.append(b.charAt(i));
//			if (i != b.length()-1) {
//				patternStr.append("|");
//			}
//		}
//		Pattern pattern = Pattern.compile("[" + patternStr + "]");
//		Matcher matcher = pattern.matcher(a);
//		String result = matcher.replaceAll("");
//		System.out.println(result);
		
//		for (int i = 0; i < a.length(); i++) {
//			boolean flag = true;
//			for (int j = 0; j < b.length(); j++) {
//				if (a.charAt(i) == b.charAt(j)) {
//					flag = false;
//				}
//			}
//			if (flag) {
//				System.out.print(a.charAt(i));
//			}
//		}
		
	}

}
