package 判断素数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		long nums[] = new long[count];
		for (int i = 0; i < count; i++) {
			nums[i] = scanner.nextLong();
		}
		scanner.close();
		for (int i = 0; i < nums.length; i++) {
			System.out.println((testIsPrime3(nums[i])?"Yes":"No") );
		}
		
	}
	public static boolean testIsPrime3(long n){
       if (n <= 3) {
            return n > 1;
        }
        
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i == 0)
               return false;
       }
       return true;
   }


}
